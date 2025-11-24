package org.example.lessons.lesson21.homeworks

fun analyzeDataType(arg: Any) {
    val result = when (arg) {
        is String -> "Это строка: $arg"
        is Number -> "Это число: $arg"
        is List<*> -> "Это список, количество элементов: ${arg.size}"
        is Map<*, *> -> "Это словарь, количество пар: ${arg.size}"
        else -> "Неизвестный тип данных"
    }
    println(result)
}