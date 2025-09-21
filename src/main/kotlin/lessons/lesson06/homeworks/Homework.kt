package org.example.lessons.lesson06.homeworks

//Задание 1
fun season(month: Int) {
    if (month == 12 || month == 1 || month == 2) {
        println("Зима")
    } else if (month == 3 || month == 4 || month == 5) {
        println("Весна")
    } else if (month == 6 || month == 7 || month == 8) {
        println("Лето")
    } else if (month == 9 || month == 10 || month == 11) {
        println("Осень")
    } else {
        println("Такого месяца не существует")
    }
}

//Задание 2
fun dog_age(age: Int) {
    if (age < 2) {
        println(age * 10.5)
    } else {
        println(age * 4)
    }
}

//Задание 3
fun transfer(length: Double) {
    if (length < 1) {
        println("пешком")
    } else if (length >= 1 && length < 5) {
        println("велосипед")
    } else {
        println("автотранспорт")
    }
}

//Задание 4
fun bonus(amount: Double) {
    if (amount < 1000) {
        println(amount / 100 * 2)
    } else {
        println(amount / 100 * 3)
    }
}

//Задание 5
fun document_type(extension: String) {
    when (extension) {
        "txt", "doc", "docx" -> println("Текстовый документ")
        "jpg", "jpeg", "png", "gif" -> println("Изображение")
        "xls", "xlsx", "csv" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

//Задание 6
fun temperature(value: Double, unit: String) {
    if (unit == "C") {
        val result = value * 9 / 5 + 32
        print(result)
        print("F")
    } else if (unit == "F") {
        val result = (value - 32) * 5 / 9
        print(result)
        print("C")
    } else {
        println("Некорректная единица измерения")
    }
}

//Задание 7
fun clothes(temp: Int) {
    if (temp < -30 || temp > 35) {
        println("Лучше не выходить из дома")
    } else if (temp < 10) {
        println("Куртка и шапка")
    } else if (temp in 10..18) {
        println("Ветровка")
    } else {
        println("Футболка и шорты")
    }
}

//Задание 8
fun movie_rating(age: Int): String {
    return if (age in 0..9) {
        "детские"
    } else if (age in 10..18) {
        "подростковые"
    } else if (age > 18) {
        "18+"
    } else {
        "Некорректный возраст"
    }
}