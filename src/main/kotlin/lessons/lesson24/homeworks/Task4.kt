package org.example.lessons.lesson24.homeworks

fun ex4(arg: String): () -> String {
    val fnc: () -> String = { arg }
    return fnc