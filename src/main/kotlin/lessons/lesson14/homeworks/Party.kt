package org.example.lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {
//Событие: вечеринка.
//Создайте класс Party, который описывает вечеринку.
//У него должны быть свойства location (String) и attendees (Int).
//Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
    fun details() {
        println("Вечеринка проходит по адресу: $location")
        println("Количество гостей: $attendees")
    }
}