package org.example.lessons.lesson25.homeworks

fun ex1(fnc: () -> Any): Long {
    val start = System.currentTimeMillis()
    fnc()
    return System.currentTimeMillis() - start
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(ex1(myFunction))
}