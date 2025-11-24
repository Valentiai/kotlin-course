package org.example.lessons.lesson22.homeworks

class MyRuntimeException(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun main() {
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("Произошёл IndexOutOfBoundsException")
        throw MyRuntimeException(e)
    }
}