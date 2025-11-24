package org.example.lessons.lesson21.homeworks

fun getStringLengthOrZero(arg: Any?): Int {
    return (arg as? String)?.length ?: 0
}