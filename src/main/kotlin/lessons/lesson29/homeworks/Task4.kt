package org.example.lessons.lesson29.homeworks

fun ex4() {
    val gson = Gson()
    val json = File("structure.json").readText()
    val cto = gson.fromJson(json, Employee::class.java)
    println(cto)
    // Задание 5
    ex5(cto).groupBy { it.position }
        .map { group -> "${group.key}: ${group.value.joinToString { it.name }}" }
        .forEach { println(it) }
}