package org.example.lessons.lesson24.homeworks

fun <U> U.ex5(): (String) -> U {
    val fnc: (String) -> U = { this }
    return fnc