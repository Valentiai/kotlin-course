package org.example.lessons.lesson19.homeworks

class ListHolder<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList() // возвращаем копию в виде неизменяемого списка
    }
}