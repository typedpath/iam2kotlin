package com.typedpath.iam2kotlin.frommd

import java.io.File

fun main(args: Array<String>) {
    // where are the md files ?
    val mdDirectory = File("./../../forks/complete-aws-iam-reference/services")
    println(mdDirectory.absolutePath)
    val name2Templates = readMds(mdDirectory)
    name2Templates.forEach {
        println("${it.key} ${it.value.size} templates")
    }
    val destinationRootDir = File("src/main/kotlin")
    println("destinationRoot: ${destinationRootDir.canonicalPath}" )
    val packageRoot = "com.typedpath.iam2kotlin.resources"
    writeResourcesAsKotlin(
        destinationRootDir,
        packageRoot,
        name2Templates
    )
}

fun writeResourcesAsKotlin(destinationRootDir: File, packageRoot: String, name2Templates: Map<String,
        List<StatementEntryTemplate>>) {
    name2Templates
        .forEach {
            writeResourceAsKotlin(
                destinationRootDir,
                packageRoot,
                it.key,
                it.value
            )
        }
}

