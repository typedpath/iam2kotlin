package com.typedpath.iam2kotlin.frommd

import java.io.File
import java.lang.Exception

fun readMds(dir: File): Map<String, List<StatementEntryTemplate>> {
    val result = mutableMapOf<String, List<StatementEntryTemplate>>()
    dir.listFiles()
        .forEach {
            val statementEntryTemplates = read(it)
            result.put(
                it.name
                    .replace(".md", "").replace("-", "_"), statementEntryTemplates
            )
        }
    return result
}

class StatementEntryTemplate(
    val id: String,
    val doc: String,
    val description: String,
    val resourceSpecs: MutableSet<String>
) {
    override fun toString() =
        "id: $id doc: $doc description: $description resourceSpecs: $resourceSpecs tokens: ${resourceSpecs.map {
            resourceSpec2Tokens(
                it
            )
        }}"
}

fun resourceSpec2Tokens(strResource: String): List<String> {
    var index = 0
    val tokens = mutableListOf<String>()
    while (index < strResource.length) {
        if (strResource[index] == '$') {
            var endIndex = index + 1
            while (endIndex < strResource.length && strResource[endIndex].isLetterOrDigit()) {
                endIndex++
            }
            tokens.add(strResource.substring(index + 1, endIndex))
            index = endIndex
        }
        index++
    }
    return tokens
}

fun read(f: File): List<StatementEntryTemplate> {
//    println("processing $f")
    val result = mutableListOf<StatementEntryTemplate>()
    var lineIndex = 0
    f.readLines().forEach {
        if (lineIndex > 1) {
            val cells = it.split("|")
            println("cell: " + cells)
            if (cells.size > 3) {
                val statementEntryTemplate = readStatmentEntryTemplate(
                    cells,
                    f
                )
                // does the template key already exist ?
                val existingStatementEntryTemplate = result.firstOrNull { it.id.equals(statementEntryTemplate.id) }
                if (existingStatementEntryTemplate != null) {
                    existingStatementEntryTemplate.resourceSpecs.addAll(statementEntryTemplate.resourceSpecs)
                } else {
                    result.add(
                        statementEntryTemplate
                    )
                }
            } else println("ignoring line $it not enough cells")
        }
        lineIndex++
    }
    return result
}

private fun readStatmentEntryTemplate(cells: List<String>, f: File): StatementEntryTemplate {
    var index = 1
    var strCell = cells[index++]
    var idStartIndex = strCell.indexOf("[")
    var idEndIndex = strCell.indexOf("]")
    if (idStartIndex < 0 || idEndIndex <= idStartIndex) {
        throw Exception("cant find id in line $cells in file $f")
    }
    return StatementEntryTemplate(id = strCell.substring(
        idStartIndex + 1,
        idEndIndex
    ),
        doc = strCell.substring(idEndIndex + 1).trim()
            .replace("(", "")
            .replace(")", ""),
        description = cells[index++],
        resourceSpecs = cells[index].split(",")
            .map { it.trim() }
            .filter { it.length > 3 }
            .filter { !it.startsWith("?") }
            .toMutableSet()
    )

}
