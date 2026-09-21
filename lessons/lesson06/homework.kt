//Задание 1: "Определение сезона"
fun printSeason(month: Int) {
    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5 -> println("Весна")
        6, 7, 8 -> println("Лето")
        9, 10, 11 -> println("Осень")
        else -> println("Некорректный месяц")
    }
}

//Задание 2: "Расчет возраста питомца"
fun printDogAge(age: Int) {
    val humanAge = if (age <= 2) {
        age * 10.5
    } else {
        2 * 10.5 + (age - 2) * 4
    }

    println(humanAge)
}

//Задание 3: "Определение способа перемещения"
fun printTransport(distance: Double) {
    if (distance <= 1) {
        println("пешком")
    } else if (distance <= 5) {
        println("велосипед")
    } else {
        println("автотранспорт")
    }
}

//Задание 4: "Расчет бонусных баллов"
fun printBonus(amount: Int) {
    val bonus = if (amount <= 1000) {
        amount / 100 * 2
    } else {
        amount / 100 * 3
    }

    println(bonus)
}

//Задание 5: "Определение типа документа"
fun printDocumentType(extension: String) {
    when (extension.lowercase()) {
        "txt", "doc", "docx" ->
            println("Текстовый документ")
        "jpg", "jpeg", "png" ->
            println("Изображение")
        "xls", "xlsx", "csv" ->
            println("Таблица")
        else ->
            println("Неизвестный тип")
    }
}

//Задание 6: "Конвертация температуры"
fun convertTemperature(temp: Double, unit: String) {
    if (unit == "C") {
        val result = temp * 9 / 5 + 32
        print(result)
        print("F")
    } else if (unit == "F") {
        val result = (temp - 32) * 5 / 9
        print(result)
        print("C")
    } else {
        println("Неизвестная единица измерения")
    }
}

//Задание 7: "Подбор одежды по погоде"
fun printClothes(temp: Int) {
    if (temp < -30 || temp > 35) {
        println("Не выходить из дома")
    } else if (temp < 10) {
        println("куртка и шапка")
    } else if (temp <= 18) {
        println("ветровка")
    } else {
        println("футболка и шорты")
    }
}

//Задание 8: "Выбор фильма по возрасту"
fun getMovieCategory(age: Int): String {
    return when (age) {
        in 0..9 -> "детские"
        in 10..18 -> "подростковые"
        in 19..Int.MAX_VALUE -> "18+"
        else -> "Некорректный возраст"
    }
}