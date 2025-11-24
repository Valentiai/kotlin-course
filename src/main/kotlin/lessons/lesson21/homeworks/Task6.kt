package org.example.lessons.lesson21.homeworks

fun tryCastToListAndPrint(arg: Any) {
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" }
        ?: "Не удалось преобразовать аргумент в список"
    println(result)
}