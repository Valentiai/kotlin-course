package org.example.lessons.lesson20.homeworks

fun <T : Comparable<T>> MutableList<T>.toSortedImmutable(asc: Boolean): List<T> {
    if (asc) {
        this.sort()
    } else {
        this.sortDescending()
    }
    return this.toList() // создаём неизменяемую копию
}
