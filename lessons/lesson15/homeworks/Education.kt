package org.example.lessons.lesson15.homeworks

// Базовый класс
open class EducationalInstitution(
    val name: String,
    val city: String
) {
    open fun describe() {
        println("Учебное заведение: $name, город: $city")
    }
}

// Производный класс — Школа
open class School(name: String, city: String, val level: String) :
    EducationalInstitution(name, city) {
    override fun describe() {
        println("Школа '$name' ($level уровень), город: $city")
    }
}

// Производный класс — Университет
open class University(name: String, city: String, val faculties: Int) :
    EducationalInstitution(name, city) {
    override fun describe() {
        println("Университет '$name' с количеством факультетов: $faculties, город: $city")
    }
}

// Разветвление от Школы — Начальная школа
class PrimarySchool(name: String, city: String) :
    School(name, city, "начальный") {
    override fun describe() {
        println("Начальная школа '$name', город: $city — обучение с 1 по 4 класс")
    }
}

// Разветвление от Школы — Средняя школа
class HighSchool(name: String, city: String) :
    School(name, city, "средний") {
    override fun describe() {
        println("Средняя школа '$name', город: $city — обучение с 5 по 11 класс")
    }
}

// Разветвление от Университета — Технический университет
class TechnicalUniversity(name: String, city: String, faculties: Int, val hasLab: Boolean) :
    University(name, city, faculties) {
    override fun describe() {
        println("Технический университет '$name', город: $city — факультетов: $faculties, лаборатории: ${if (hasLab) "есть" else "нет"}")
    }
}

// Разветвление от Университета — Гуманитарный университет
class HumanitiesUniversity(name: String, city: String, faculties: Int, val mainField: String) :
    University(name, city, faculties) {
    override fun describe() {
        println("Гуманитарный университет '$name', город: $city — основное направление: $mainField")
    }
}