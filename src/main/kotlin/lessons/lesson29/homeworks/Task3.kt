package org.example.lessons.lesson29.homeworks

fun ex3() {
    val gson = GsonBuilder().setPrettyPrinting().create()
    gson.toJson(cto).also {
        File("structure.json").writeText(it)
    }
}