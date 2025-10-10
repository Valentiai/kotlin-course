package org.example.lessons.lesson10.homeworks

fun main() {
//Задачи на работу со словарём
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val firstMap: Map<Int, Int> = mapOf()
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val secondMap: Map<Float, Double> = mapOf(1.1f to 1.11, 2.2f to 2.22, 3.3f to 3.33)
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val thirdMap: MutableMap<Int, String> = mutableMapOf(1 to "1", 2 to "2")
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    thirdMap[3] = "3"
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    println(thirdMap[1])
    println(thirdMap[4])
//Удалите определенный элемент из изменяемого словаря по его ключу.
    thirdMap.remove(1)
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val fourthMap: MutableMap<Double, Int> = mutableMapOf(1.1 to 1, 2.2 to 2, 3.3 to 3, 4.4 to 0)
    for ((k, v) in fourthMap) {
        if (v == 0) {
            println("бесконечность")
        } else {
            println(k / v)
        }
    }
//Измените значение для существующего ключа в изменяемом словаре.
    fourthMap[4.4] = 4
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val fifthMap: Map<Int, String> = mapOf(1 to "1", 2 to "2")
    val sixthMap: Map<Int, String> = mapOf(3 to "3", 4 to "4")
    val seventhMap: MutableMap<Int, String> = mutableMapOf()
    for ((k, v) in fifthMap) {
        seventhMap[k] = v
    }
    for ((k, v) in sixthMap) {
        seventhMap[k] = v
    }
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val eighthMap: MutableMap<String, MutableList<Int>> = mutableMapOf()
    for (i in 1..9) {
        eighthMap["$i"] = mutableListOf(i, i * i, i * i * i)
    }
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.
    val ninthMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    for (i in 1..9) {
        ninthMap[i] = mutableSetOf("$i", "${i * 2}", "${i * 3}")
    }
    ninthMap[1]?.add("4")
    println(ninthMap[1])
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val tenthMap: MutableMap<Pair<Int, Int>, String> = mutableMapOf()
    for (i in 1..9) {
        tenthMap[i to i*i] = "$i"
    }
    for ((k,v) in tenthMap) {
        if (5 in listOf(k.first, k.second)) {
            println(k)
        }
    }
//Задачи на подбор оптимального типа для словаря
//Словарь библиотека: Ключи - автор книги, значения - список книг
    val eleventhMap: MutableMap<String, List<String>> = mutableMapOf()
//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val twelfthMap: MutableMap<String, List<String>> = mutableMapOf()
//Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val thirteenthMap: MutableMap<String, List<String>> = mutableMapOf()
//Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val fourteenthMap: MutableMap<String, MutableList<String>> = mutableMapOf()
//Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val fifteenthMap: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf()
}