package org.example.lessons.lesson21.homeworks

fun safeCastToList(arg: Any): Int {
    return (arg as? List<*>)?.size ?: -1
}