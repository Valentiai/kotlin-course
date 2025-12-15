package org.example.lessons.lesson26.homeworks

fun ex2() {
    File("workspace/task2/testDir").apply {
        mkdirs()
        if (isDirectory) {
            println("Это директория")
        } else {
            println("Это не директория")
        }
        println(absolutePath)
    }
}