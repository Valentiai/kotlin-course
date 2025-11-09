package org.example.lessons.lesson18.homeworks

// класс оборудования с возможностью регулировки температуры и открывания
abstract class TemperatureOpenableDevice(
    override val maxTemperature: Int
) : ProgrammableDevice(), TemperatureRegulatable, Openable {

    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("Температура установлена на $temp°C")
        } else {
            println("Ошибка: недопустимая температура ($temp°C)! Допустимо до $maxTemperature°C")
        }
    }

    override fun open() {
        if (!isOpen) {
            isOpen = true
            println("Устройство открыто")
        } else {
            println("Устройство уже открыто")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Устройство закрыто")
        } else {
            println("Устройство уже закрыто")
        }
    }
}
