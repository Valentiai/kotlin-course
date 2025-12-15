package org.example.lessons.lesson26.homeworks

fun ex1() {
    File("workspace/task1/example.txt").apply {
        parentFile?.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
        if (exists()) {
            println("Файл существует")
        } else {
            println("Файл не найден")
        }
    }
}