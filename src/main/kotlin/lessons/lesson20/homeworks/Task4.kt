package org.example.lessons.lesson20.homeworks

fun Number.within(other: Number, deviation: Number): Boolean {
    val diff = (this.toDouble() - other.toDouble()).absoluteValue
    return diff <= deviation.toDouble()
}