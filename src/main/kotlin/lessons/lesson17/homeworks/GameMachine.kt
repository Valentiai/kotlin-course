package org.example.lessons.lesson17.homeworks

class GameMachine(
    val color: String,                  // цвет автомата
    val model: String,                  // модель автомата
    private val owner: String,          // владелец
    private val supportPhone: String    // телефон поддержки
) {

    private var isTurnedOn: Boolean = false          // включен ли автомат
    private var osLoaded: Boolean = false            // ОС загружена ли
    private val installedGames: MutableList<String> = mutableListOf() // список установленных игр
    private var hasJoystick: Boolean = false         // есть ли джойстик
    private var balance: Double = 0.0                // баланс вырученных средств
    private var sessionPaid: Boolean = false         // игровой сеанс оплачен ли
    private var sessionPrice: Double = 10.0          // стоимость одного сеанса
    private val pinCode: String = "1234"             // пин-код автомата

    // ---------------- Методы ----------------

    fun turnOn(): Unit {
        // включить автомат
    }

    fun turnOff(): Unit {
        // выключить автомат
    }

    fun loadOS(): Unit {
        // загрузить операционную систему
    }

    fun shutdownOS(): Unit {
        // завершить работу операционной системы
    }

    fun showGames(): List<String> {
        // вернуть список установленных игр
        return installedGames
    }

    fun startGame(gameName: String): Boolean {
        // включить игру (true если успешно)
        return false
    }

    fun payForSession(amount: Double): Boolean {
        // оплатить игровой сеанс
        return false
    }

    fun withdrawCash(enteredPin: String): Double? {
        // забрать наличные, если пин верен
        return null
    }

    private fun openSafe(enteredPin: String): Boolean {
        // открыть сейф, если пин правильный
        return enteredPin == pinCode
    }
}