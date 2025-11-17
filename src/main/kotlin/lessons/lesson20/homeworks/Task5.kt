package org.example.lessons.lesson20.homeworks

fun String.encrypt(base: Int): String {
    return this.map { ch ->
        (ch.code + base).toChar()
    }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { ch ->
        (ch.code - base).toChar()
    }.joinToString("")
}