package org.example.lessons.lesson29.homeworks

fun ex5(arg: Employee): List<Employee> {
    return if (arg.subordinates.isNotEmpty()) {
        arg.subordinates
            .flatMap {
                ex5(it)
            } + arg.copy(subordinates = emptyList())
    } else {
        listOf(arg)
    }
}