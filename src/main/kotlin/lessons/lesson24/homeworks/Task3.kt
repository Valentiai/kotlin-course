package org.example.lessons.lesson24.homeworks

fun <T, R> T.ex3(fnc: T.() -> R): R {
    return fnc()