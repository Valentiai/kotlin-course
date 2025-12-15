package org.example.lessons.lesson26.homeworks

fun ex7() {
    val phrase = "This is a README file."
    File("workspace/task7/docs/readme.md").apply {
        parentFile?.mkdirs()
        if (!this.exists()) {
            createNewFile()
            writeText(phrase)
        }
        check(readText() == phrase)
    }
}