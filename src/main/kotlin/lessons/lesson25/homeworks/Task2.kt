package org.example.lessons.lesson25.homeworks

fun main() {
    val em = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "dep1"
    }
}