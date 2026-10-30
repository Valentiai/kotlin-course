package org.example.lessons.lesson16.homeworks

// ANSI-коды для цветов
val YELLOW = "\u001B[33m"
val RED_BG = "\u001B[41m"
val WHITE = "\u001B[37m"
val BLANK = "\u001B[0m"

// Уровни логирования
enum class LogLevel {
    INFO, WARNING, ERROR, DEBUG
}

// Класс Логгер
class Logger {

    // 1️⃣ Базовый метод: INFO по умолчанию
    fun log(message: String) {
        println("[INFO] $message")
    }

    // 2️⃣ Перегрузка: уровень логирования + сообщение
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO, LogLevel.DEBUG -> println("[${level.name}] $message")
            LogLevel.WARNING -> println("$YELLOW[WARNING] $message$BLANK")
            LogLevel.ERROR -> println("$WHITE$RED_BG[ERROR] $message$BLANK")
        }
    }

    // 3️⃣ Перегрузка: список сообщений (все INFO)
    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg) // вызывает базовый метод
        }
    }

    // 4️⃣ Перегрузка: объект Exception
    fun log(exception: Exception) {
        val msg = exception.message ?: "Unknown error"
        log(LogLevel.ERROR, msg)
    }
}

// Проверка работы
fun main() {
    val logger = Logger()

    // 1️⃣ Базовый INFO
    logger.log("Программа запущена")

    // 2️⃣ Разные уровни
    logger.log(LogLevel.INFO, "Обычное сообщение")
    logger.log(LogLevel.WARNING, "Внимание: недостаточно памяти")
    logger.log(LogLevel.ERROR, "Ошибка подключения к базе")
    logger.log(LogLevel.DEBUG, "Переменная x = 42")

    // 3️⃣ Список сообщений
    val messages = listOf("Первое сообщение", "Второе сообщение", "Третье сообщение")
    logger.log(messages)

    // 4️⃣ Исключение
    try {
        val x = 10 / 0
    } catch (e: Exception) {
        logger.log(e)
    }
}