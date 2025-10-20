package org.example.lessons.lesson13.homeworks

fun main() {

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val testTimes = mapOf("testLogin" to 4.5,"testRegister" to 6.0,"testLogout" to 3.5,"testProfileUpdate" to 5.0)
    println(testTimes.values.average())
//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов, а значения - строка с метаданными
//Выведите список всех тестовых методов.
    fun func2(dict:Map<String,String>) {
        for (i in dict.keys) {
            println(i)
        }
    }
//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val dict1:MutableMap<String,String> = mutableMapOf("test1" to "test1_Result")
    dict1["test2"] = "test2_Result"
    println(dict1)
//Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val dict2:Map<String,String> = mapOf()
    println(dict2.values.count {it=="passed"})
//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val dict3:MutableMap<String,String> = mutableMapOf()
    for ((k,v) in dict3) {
        if (v=="Исправлен") {
            dict3.remove(k)
        }
    }
//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val dict4:Map<String,String> = mapOf()
    dict4.forEach { (url,status) -> println("Страница: $url, Статус: $status") }
//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val dict5:Map<String,Double> = mapOf()
    //допустим, порог=1
    println(dict5.filterValues { it > 1 })
//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
//Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val dict6:Map<String,String> = mapOf()
    val end_point:String = ""
    println(dict6.getOrDefault(end_point,"не был протестирован"))
//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType"
//Ответ не может быть null.
    val dict7:Map<String,String> = mapOf()
    println(dict7.getOrDefault("browserType", "Ключа нет"))
//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val dict8:Map<String,String> = mapOf()
    println(dict8+("1" to "2"))
//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val dict9:Map<String,String> = mapOf()
    println(dict9.getOrDefault("Конкретная модель", "Настройки по умолчанию"))
//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val dict10:Map<String,String> = mapOf()
    println(dict10.containsKey("Определенный код ошибки"))
//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped")
//Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то есть в ключе содержится требуемая версия.
    val dict11:Map<String,String> = mapOf()
    println(dict11.filterKeys {it=="Тестовый сценарий"})
//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
//Проверьте, есть ли модули с неудачным тестированием.
    val dict12:Map<String,String> = mapOf()
    println(dict12.filterValues {it=="Неудачное тестирование"})
//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val dict13:MutableMap<String,String> = mutableMapOf()
    val dict14:Map<String,String> = mapOf()
    println(dict13 + dict14)
//Объедините два неизменяемых словаря с данными о багах.
    val dict15:Map<String,String> = mapOf()
    val dict16:Map<String,String> = mapOf()
    println(dict15 + dict16)
//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val dict17:MutableMap<String,String> = mutableMapOf()
    dict17.clear()
//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val dict18:Map<String,String> = mapOf()
    println(dict18.filterValues { it!="skipped" })
//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val dict19:Map<String,String> = mapOf()
    val dict20 = dict19.toMutableMap()
    dict20.remove("1")
    dict20.remove("2")
//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val dict21:Map<String,String> = mapOf("1" to "1.1")
    val list_of_strings: MutableList<String> = mutableListOf()
    for ((k,v) in dict21) {
        list_of_strings.add("$k: $v")
    }
    println(list_of_strings)
//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val dict22: MutableMap<String,String> = mutableMapOf()
    val dict23 = dict22.toMap()
    println(dict23)
//Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val dict24: Map<Int,String> = mapOf(1 to "1")
    val dict25: MutableMap<String,String> = mutableMapOf()
    for ((k,v) in dict24) {
        dict25[k.toString()] = v
    }
    println(dict25)
//Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера)
//увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val dict26: MutableMap<String,Double> = mutableMapOf("1" to 1.1, "2" to 2.2)
    for ((k,v) in dict26) dict26[k] = v*1.1
    println(dict26)
//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val dict27: Map<String,String> = mapOf()
    println(dict27.isEmpty())
//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val dict28: Map<String,String> = mapOf()
    println(dict28.isNotEmpty())
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val dict29: Map<String,String> = mapOf("test1" to "success", "test2" to "success", "test3" to "fail")
    println("Прошли ли успешно все автоматизированные тесты в словаре с результатами: ${dict29.values.distinct().size==1}")
//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val dict30: Map<String,String> = mapOf("test1" to "success", "test2" to "success", "test3" to "fail")
    println("Cодержит ли словарь с результатами тестирования хотя бы один тест с ошибкой: ${dict30.values.contains("fail")}")
//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val dict31: Map<String,String> = mapOf("test1" to "success", "test2" to "success", "test3_optional" to "fail", "test4_optional" to "success")
    println(dict31.filter {it.value.contains("fail") && it.key.contains("optional")})
}