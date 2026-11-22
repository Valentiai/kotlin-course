package org.example.lessons.lesson21.homeworks

fun main() {
    val param1: String = "String"
    val param2: Int = 2410
    val param3: List<Int> = listOf(1,2,3,4,5)
    val param4: Map<Int,String> = mapOf(1 to "1", 2 to "2", 3 to "3")
    println(getStringLengthOrZero("18"))
}

//Задача 1
fun analyzeDataType(param: Any) {
    if (param is String) {
        println("Это строка: $param")
    }
    else if (param is Number) {
        println("Это число: $param")
    }
    else if (param is List<*>) {
        println("Это список, количество элементов: ${param.size}")
    }
    else if (param is Map<*,*>) {
        println("Это словарь, количество пар: ${param.size}")
    }
    else {println("Неизвестный тип данных")}
}

//Задача 2
fun safeCastToList(param: Any) {
    val new_param: List<*>? = param as? List<*>
    if (new_param is List<*>) {
        return new_param.size
    }
    else {
        return -1
    }
}
//Задача 3
fun getStringLengthOrZero(param: Any?): Int {
    if (param is null || param !is String) {
        return 0
    }
    else {
        return (param as String).length
    }
}
//Задача 4
fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}
//Задача 5
fun sumIntOrDoubleValues(list: List<Any>): Double {
    return list.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 }
}
//Задача 6
fun tryCastToListAndPrint(arg: Any) {
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" }
        ?: "Приведение неудачно"
    println(result)
}