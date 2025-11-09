package org.example.lessons.lesson18.homeworks

// Абстрактный класс для программируемого оборудования
abstract class ProgrammableDevice : PowerDevice(), Programmable {

    private var currentProgram: String? = null

    override fun programAction(action: String) {
        currentProgram = action
        println("Задана программа: \"$action\"")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("Ошибка: устройство выключено!")
            return
        }

        if (currentProgram != null) {
            println("Выполнение программы: \"$currentProgram\"")
        } else {
            println("Нет заданной программы")
        }
    }
}