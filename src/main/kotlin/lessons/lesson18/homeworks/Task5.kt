package org.example.lessons.lesson18.homeworks

// === БАЗОВЫЙ АБСТРАКТНЫЙ КЛАСС ===

abstract class PowerableDevice : Powerable {
    protected var isPoweredOn: Boolean = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("${this::class.simpleName} включено")
        } else {
            println("${this::class.simpleName} уже включено")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("${this::class.simpleName} выключено")
        } else {
            println("${this::class.simpleName} уже выключено")
        }
    }
}

// === ПРОГРАММИРУЕМОЕ УСТРОЙСТВО ===

abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    private var currentAction: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("${this::class.simpleName} выключено. Нельзя задать программу.")
            return
        }
        currentAction = action
        println("${this::class.simpleName}: программа установлена — \"$action\"")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("${this::class.simpleName} выключено. Нельзя выполнить программу.")
            return
        }
        if (currentAction == null) {
            println("${this::class.simpleName}: нет установленной программы")
        } else {
            println("${this::class.simpleName} выполняет программу \"$currentAction\"")
        }
    }
}

// === УСТРОЙСТВО С ТЕМПЕРАТУРОЙ И ОТКРЫТИЕМ ===

abstract class TemperatureOpenableDevice(
    override val maxTemperature: Int
) : ProgrammableDevice(), TemperatureRegulatable, Openable {

    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("${this::class.simpleName} выключено. Нельзя установить температуру.")
            return
        }
        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("${this::class.simpleName}: температура установлена на $temp°C")
        } else {
            println("${this::class.simpleName}: недопустимая температура ($temp°C)! Допустимо до $maxTemperature°C")
        }
    }

    override fun open() {
        if (!isOpen) {
            isOpen = true
            println("${this::class.simpleName} открыто")
        } else {
            println("${this::class.simpleName} уже открыто")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("${this::class.simpleName} закрыто")
        } else {
            println("${this::class.simpleName} уже закрыто")
        }
    }
}

// === КОНКРЕТНЫЕ УСТРОЙСТВА ===

// Холодильник
class Refrigerator : TemperatureOpenableDevice(maxTemperature = 10), Cleanable {
    override fun clean() {
        println("Холодильник очищен внутри и снаружи.")
    }
}

// Стиральная машина
class WashingMachine : TemperatureOpenableDevice(maxTemperature = 90), Drainable, WaterConnection {
    override fun connectToWaterSupply() {
        println("Стиральная машина подключена к водопроводу.")
    }

    override fun getWater(amount: Int) {
        println("Забрано $amount л воды для стирки.")
    }

    override fun connectToDrain() {
        println("Подключение к сливу завершено.")
    }

    override fun drain() {
        println("Вода слита из барабана.")
    }
}

// Чайник
class Kettle : TemperatureOpenableDevice(maxTemperature = 100), WaterContainer {
    override val capacity: Int = 2
    private var currentWater: Int = 0

    override fun fillWater(amount: Int) {
        if (currentWater + amount > capacity) {
            println("Чайник переполнен!")
        } else {
            currentWater += amount
            println("Добавлено $amount л воды (теперь $currentWater л)")
        }
    }

    override fun getWater(amount: Int) {
        if (currentWater >= amount) {
            currentWater -= amount
            println("Взято $amount л воды (осталось $currentWater л)")
        } else {
            println("Недостаточно воды.")
        }
    }
}

// Духовка
class Oven : TemperatureOpenableDevice(maxTemperature = 250), Cleanable {
    override fun clean() {
        println("Духовка очищена после готовки.")
    }
}

fun main() {
    val fridge = Refrigerator()
    val washer = WashingMachine()
    val kettle = Kettle()
    val oven = Oven()

    // Холодильник
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.open()
    fridge.programAction("Охлаждение")
    fridge.execute()
    fridge.clean()
    fridge.close()

    println("——————")

    // Стиральная машина
    washer.connectToWaterSupply()
    washer.connectToDrain()
    washer.powerOn()
    washer.setTemperature(60)
    washer.programAction("Стирка хлопка")
    washer.execute()
    washer.drain()
    washer.powerOff()

    println("——————")

    // Чайник
    kettle.fillWater(1)
    kettle.powerOn()
    kettle.setTemperature(90)
    kettle.programAction("Кипячение")
    kettle.execute()
    kettle.getWater(0.5)
    kettle.powerOff()

    println("——————")

    // Духовка
    oven.powerOn()
    oven.open()
    oven.setTemperature(200)
    oven.programAction("Выпечка хлеба")
    oven.execute()
    oven.clean()
    oven.close()
}
