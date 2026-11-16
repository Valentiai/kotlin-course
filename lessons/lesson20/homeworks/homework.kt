package org.example.lessons.lesson20.homeworks

//Задание 1
fun Array<out Number>.firstAndLast(): Pair<Number?, Number?> {
    return if (this.isEmpty()) {
        Pair(null, null)
    } else {
        Pair(this.first(), this.last())
    }
}

//Задание 2
fun <T : Comparable<T>> MutableList<T>.toSortedImmutable(asc: Boolean): List<T> {
    if (asc) {
        this.sort()
    } else {
        this.sortDescending()
    }
    return this.toList() // создаём неизменяемую копию
}

//Задание 3
fun <K, V> Map<K, List<V>>?.extractByIndex(index: Int): Map<String, V?>? {
    if (this == null) return null

    return this.mapValues { (_, list) ->
        list.getOrNull(index)
    }.mapKeys { (key, _) ->
        key.toString()
    }
}

//Задание 4
fun Number.within(other: Number, deviation: Number): Boolean {
    val diff = (this.toDouble() - other.toDouble()).absoluteValue
    return diff <= deviation.toDouble()
}

//Задание 5
fun String.encrypt(base: Int): String {
    return this.map { ch ->
        (ch.code + base).toChar()
    }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { ch ->
        (ch.code - base).toChar()
    }.joinToString("")
}

//Задание 6
fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}

fun main() {

}