package org.example.lessons.lesson19.homeworks

interface Mapper<F, T> {
    fun map(from: F): T
    fun mapList(fromList: List<F>): List<T> {
        return fromList.map { map(it) }
    }
}