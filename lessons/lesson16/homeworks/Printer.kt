package org.example.lessons.lesson16.homeworks

// Абстрактный принтер
abstract class Printer {
    abstract fun print(text: String)
}

// Лазерный принтер — просто печатает слова
class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.trim().split(Regex("\\s+"))
        for (word in words) {
            print("[BLACK ON WHITE]$word ")
        }
        println()
    }
}

// Струйный принтер — печатает слова "разноцветно"
class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val words = text.trim().split(Regex("\\s+"))
        val colorPairs = listOf(
            "RED ON YELLOW",
            "BLUE ON CYAN",
            "PURPLE ON GREEN",
            "YELLOW ON BLUE",
            "CYAN ON RED"
        )

        for ((index, word) in words.withIndex()) {
            val color = colorPairs[index % colorPairs.size]
            print("[$color]$word ")
        }
        println()
    }
}

// Главная функция для проверки
fun main() {
    val longText = """
        Kotlin — современный язык программирования.
        Этот текст достаточно длинный, чтобы проверить,
        как принтеры обрабатывают много слов и разные пробелы.
        Проверка:  multiple   spaces, newlines, и табы тоже.
    """.trimIndent()

    val printers: List<Printer> = listOf(LaserPrinter(), InkjetPrinter())

    for (printer in printers) {
        println("\n=== ${printer::class.simpleName} ===")
        printer.print(longText)
    }
}