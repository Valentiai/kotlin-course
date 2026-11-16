package org.example.lessons.lesson19.homeworks

//Задание 1
fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isEmpty() || list.size % 2 == 0) return null
    val middleIndex = list.size / 2
    return list[middleIndex]
}

//Задание 2
class ListHolder<T>(val list: MutableList<T>) {
    fun append(val item: T) {
        list.add(item)
    }
    fun getList(): List {
        return list.toList()
    }
}

//Задание 3
//Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа
interface Mapper<F,T> {
    fun map(from: F): T
    fun mapList(fromList: List<F>): List<T> {
        return fromList.map { map(it) }
    }
}

//Задание 4
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(from: String): List<String> {
        return from.split(" ")
    }

    override fun mapList(fromList: List<String>): List<List<String>> {
        return fromList.map { map(it) }
    }
}

//Задание 5
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}

//Задание 6
interface Validator<T> {
    fun validate(item: T): Boolean
}

//Задание 7
class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean {
        return !item.isNullOrBlank()
    }
}

//Задание 8
class OddValidator : Validator<Int> {
    override fun validate(item: Int): Boolean {
        return item % 2 == 0
    }
}

//Задание 9
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(item: List<T?>): Boolean {
        return item.all { it != null && it.toDouble() != 0.0 }
    }
}





fun main() {

}