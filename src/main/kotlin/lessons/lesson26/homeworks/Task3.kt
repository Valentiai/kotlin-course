package org.example.lessons.lesson26.homeworks

fun ex3() {
    with(File("workspace/task3/structure")) {
        mkdirs()
        resolve("myDir")
    }.apply {
        mkdir()
        resolve("subDir1").mkdir()
        resolve("subDir2").mkdir()
        val files = list()
        if (files?.all { it.contains("subDir1") || it.contains("subDir2") } ?: false) {
            println("Директории найдены")
        } else {
            println("Директории не найдены в ${list.joinToString()}")
        }
    }
}