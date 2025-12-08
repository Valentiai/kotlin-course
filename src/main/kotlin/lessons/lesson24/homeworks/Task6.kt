package org.example.lessons.lesson24.homeworks

fun String.colorizeWords(fnc: (String) -> String) {
    val result = split(" ").joinToString(" ") {
        it.colorize(fnc(it))
    }
    println(result)
}

fun main() {
    val colors = listOf(Colors.RED, Colors.BLUE, Colors.GREEN, Colors.PURPLE, Colors.YELLOW, Colors.CYAN)

    val text = "Напиши функцию colorizeWords которая печатает слова из длинного предложения разбитого по пробелу разным цветом. Правило подбора цвета для каждого слова нужно передавать в виде функции, которая принимает слово и возвращает это же слово но уже \"в цвете\" через функцию colorize."

    val ex1 = { word: String ->
        when {
            word[0].uppercase()[0] == word[0] -> Colors.YELLOW
            word.length < 3 -> Colors.BLUE
            word.length > 6 -> Colors.GREEN
            word.length % 2 == 0 -> Colors.RED
            else -> Colors.PURPLE
        }
    }

    var counter = 0

    val ex2 = { _: String ->
        if (counter >= colors.size) counter = 0
        colors[counter++]
    }

    var counterFunction = { counter++ }

    val ex3 = { _: String ->
        if (counter == colors.size - 1) {
            counterFunction = { counter-- }
        }
        if (counter < 0) {
            counter++
            counterFunction = { counter++ }
        }
        colors[counterFunction()]
    }

    text.colorizeWords(ex1)

    text.colorizeWords(ex2)

    counter = 0

    text.colorizeWords(ex3)
}