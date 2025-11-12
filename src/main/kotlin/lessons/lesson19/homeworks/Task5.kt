package org.example.lessons.lesson19.homeworks

fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}