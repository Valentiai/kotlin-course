package org.example.lessons.lesson11.homeworks


//Задачи на сигнатуру метода.
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение.
//В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

//Не принимает аргументов и не возвращает значения.
fun method1() {
    return
}

//Принимает два целых числа и возвращает их сумму.
fun method2(a: Int, b: Int): Int {
    return a + b
}

//Принимает строку и ничего не возвращает.
fun method3(s: String) {}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun method4(numbers: List<Int>): Double {
    return numbers.average()
}

/* Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле. */
private fun method5(str: String?): Int? {
    return 1
}

/* Не принимает аргументов и возвращает nullable вещественное число. */
fun method6(): Double? {
    return 1.0
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun method7(numbers: List<Int>?) {
    return
}

//Принимает целое число и возвращает nullable строку.
fun method8(number: Int): String? {
    return "1"
}

/* Не принимает аргументов и возвращает список nullable строк. */
fun method9(): List<String?> {
    return listOf("1", "2")
}

/* Принимает nullable строку и nullable целое число и возвращает nullable булево значение. */
fun method10(string: String?, number: Int?): Boolean? {
    return true
}

//Задачи на написание кода.
//Напишите валидную сигнатуру метода, а также рабочий код для задач.
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(number:Int):Int {return number*2}
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(number:Int):Boolean {return number%2==0}
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n:Int) {
    if (n<1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers:List<Int>):Int? {
    for (i in numbers) {
        if (i<0) {return i}
    }
    return null
}
//Напишите функцию processList, которая принимает список строк.
//Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings:List<String?>) {
    for (i in strings) {
        if (i == null) {return}
        println(i)
    }
}
fun main() {

}