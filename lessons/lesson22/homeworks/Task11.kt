package org.example.lessons.lesson22.homeworks

class MyAssertionError(message: String) : AssertionError(message)

fun main() {
    throw MyAssertionError("Алярм!!")
}