package org.example.lessons.lesson27.homeworks

enum class Status {
    PASSED,
    BROKEN,
    FAILED,
}
enum class RealEstate(val value: String) {
    ROOM("Комната"),
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    GARAGE("Гараж"),
    NON_RESIDENTAL_PREMISES("Нежилая недвижимость"),
}
enum class Planet(
    val distanceAu: Double,   // расстояние до Солнца в а.е.
    val massKg: Double        // масса в кг
) {
    MERCURY(0.39, 3.30e23),
    VENUS(0.72, 4.87e24),
    EARTH(1.00, 5.97e24),
    MARS(1.52, 6.42e23),
    JUPITER(5.20, 1.90e27),
    SATURN(9.58, 5.68e26),
    URANUS(19.20, 8.68e25),
    NEPTUNE(30.05, 1.02e26)
}