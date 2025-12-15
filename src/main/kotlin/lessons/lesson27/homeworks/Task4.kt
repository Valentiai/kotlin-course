package org.example.lessons.lesson27.homeworks

fun ex4(fnc: (Planet) -> Boolean): Planet {
    return Planet.entries
        .firstOrNull(fnc)
        ?: throw RuntimeException("Подходящей планеты не найдено")
}