package org.example.lessons.lesson20.homeworks

fun <K, V> Map<K, List<V>>?.extractByIndex(index: Int): Map<String, V?>? {
    if (this == null) return null

    return this.mapValues { (_, list) ->
        list.getOrNull(index)
    }.mapKeys { (key, _) ->
        key.toString()
    }
}