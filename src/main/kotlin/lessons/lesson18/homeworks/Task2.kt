package org.example.lessons.lesson18.homeworks

// Абстрактный класс для включаемого оборудования
abstract class PowerDevice : Powerable {

    protected var isPoweredOn: Boolean = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("Устройство включено")
        } else {
            println("Устройство уже было включено")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("Устройство выключено")
        } else {
            println("Устройство уже было выключено")
        }
    }
}
