package org.example.lessons.lesson19.homeworks

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.isEmpty() || list.size % 2 == 0) return null
    val middleIndex = list.size / 2
    return list[middleIndex]
}