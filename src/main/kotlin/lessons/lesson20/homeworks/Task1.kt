package org.example.lessons.lesson20.homeworks

fun Array<out Number>.firstAndLast(): Pair<Number?, Number?> {
    return if (this.isEmpty()) {
        Pair(null, null)
    } else {
        Pair(this.first(), this.last())
    }
}