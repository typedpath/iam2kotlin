package com.typedpath.iam2kotlin.frommd

import java.io.File
import java.lang.StringBuilder
import java.util.*

//package com.typedpath.awscloudformation.iam.s3

fun writeResourceAsKotlin(
    destinationRootDir: File, packageRoot: String, resourceName: String, templates:
    List<StatementEntryTemplate>
) {
    val packageName = "$packageRoot.${resourceName.toLowerCase()}"
//write the action enum
    val packageRootDirPath = destinationRootDir.toPath().resolve(packageName.replace(".", "/"))
    println(" $resourceName root dir: ${packageRootDirPath.toFile()}")
    val classname = "${resourceName}Action".capitalize()
    packageRootDirPath.toFile().mkdirs()
    val f = File(packageRootDirPath.toFile(), classname + ".kt")
    val src =
        writeActionsAsKotlin(resourceName, templates, packageName)
    f.writeText(src)
}

fun resourceSpecToFunction(resourceSpecIn: String, indent: String, resourcename: String) : String {
    if (!resourceSpecIn.contains("$")) {
        val functionName = resourceSpecIn
            .replace(":", "")
            .replace("/*", "All")
            .replace("/", "")
            .replace("*", "All")
        return """${indent}fun $functionName() = IamPolicy.Resource("$resourceSpecIn")
"""
    }

    //arn:aws:s3:::$bucket-name/$key-name
    val delimiters = "\$/:"
    val resourceSpec = resourceSpecIn//"arn:\$region:logs:\$region:\$account:log-group:\$group-name:log-stream:\$stream-name"
    val tokenizer = StringTokenizer(resourceSpec, delimiters, true) //resourceSpec.split('$', '/')
    val vars = mutableSetOf<String>()
    val tokens = tokenizer.toList().toMutableList()
    var usePrefix = false
    val prefix = StringBuilder()
    fun token2VarToken(token: String) = token.replace("-", "")
    for (i in 0..(tokens.size-1)) {
        var token = tokens[i] as String
        if (token.equals("\$")) {
            if (tokens.size <= (i + 1))
                throw Exception ("invalid token at index ${i} in $resourceSpec" )
            var vartoken = token2VarToken(tokens.get(i +1) as String)
            vars.add(vartoken)
            tokens[i+1] = vartoken
        } else if (!usePrefix && (token.equals(resourcename) || token.equals("restapis") || token.equals("dynamodb") || token.equals("waf"))) {
            usePrefix = true
        } else if (usePrefix && (token.length!=1 || !delimiters.contains(token)) && !vars.contains(token2VarToken(token)) ) {
            prefix.append(  (if (token.equals("*")) "all" else token.replace("-", "") ) + "_")
        }

    }
    val functionName = """${prefix}by${vars.map { it.capitalize() }.joinToString("")}"""
    val functionArgs = """${vars.map{it + ": String"}.joinToString(", ")}"""
    val fResourceSpec = tokens.joinToString("")

    return (
"""${indent}fun $functionName($functionArgs) = IamPolicy.Resource("$fResourceSpec")
""")
}

fun writeActionsAsKotlin(resourceName: String, templates: List<StatementEntryTemplate>,
                         packageName: String): String {
    fun actionVarName(template: StatementEntryTemplate) : String {
        val colonIndex = template.id.indexOf(":")
        return  if (template.id.equals("support:*")) "SupportAll"  else
            if (colonIndex>0) template.id.substring(colonIndex+1) else template.id
    }
    fun actionClassName(template: StatementEntryTemplate) = "_${actionVarName(template)}"
    return (
            """
package $packageName

import com.typedpath.iam2kotlin.IamPolicy

class ${resourceName.capitalize()}Action() {

    companion object { 
        val All = IamPolicy.Action("$resourceName:*")    
${templates.map{
"""        // see ${it.doc} 
        // ${it.description}   
        val ${actionVarName(it)} = ${actionClassName(it)}()"""}.joinToString(""" 
""")}
    }
${templates.map{
"""      class ${actionClassName(it)} : IamPolicy.Action("${it.id}") {
${it.resourceSpecs.map { """             //$it"
"""+ resourceSpecToFunction(it, "            ", resourceName)   }.joinToString("").trimEnd()}
         }       
"""}.joinToString(""" 
""")}

}        
"""
            )
}



