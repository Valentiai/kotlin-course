package org.example.lessons.lesson21.homeworks

fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}