package org.example.lessons.lesson09.homeworks

import kotlin.rem

//Работа с массивами Array

//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val numbers1 = arrayOf(1, 2, 3, 4, 5)
//Создайте пустой массив строк размером 10 элементов.
val numbers2 = Array(10) { "" }
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val doubles = DoubleArray(5) { i -> i * 2.0 }
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
val triplearr = IntArray(5) { i -> i*3 }
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
val mixedarr: Array<String?> = arrayOf(null, " ", " ")
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
val originalarray = intArrayOf(1, 2, 3, 4, 5)
val copyarray = IntArray(originalarray.size)
for (i in originalarray.indices) {
    copyarray[i] = originalarray[i]
}
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
val array1 = intArrayOf(10, 20, 30, 40, 50)
val array2 = intArrayOf(1, 2, 3, 4, 5)
val result = IntArray(array1.size)
for (i in array1.indices) {
    result[i] = array1[i] - array2[i]
}
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
val arr = intArrayOf(3, 7, 5, 2, 9)
var index = 0
var foundIndex = -1
while (index < arr.size) {
    if (arr[index] == 5) {
        foundIndex = index
        break
    }
    index++
}
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
val arroddeven = IntArray(10) { it }
val res: Map<Int, String> = mapOf(0 to "чётное", 1 to "нечётное")
for (i in arroddeven) {
    println("$i ${res[i % 2]}")
}
//Создай функцию, которая принимает массив строк и строку для поиска.
//Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//Распечатай найденный элемент.
fun function1(arr: Array<String>, search: String) {
    for (i in arr) {
        if (i.contains(search)) {
            println(i)
        }
    }
}

//Работа со списками List

//Создайте пустой неизменяемый список целых чисел.
val readOnlyList1: List<Int> = listOf(1, 2, 3)
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val readOnlyList2: List<String> = listOf("Hello", "World", "Kotlin")
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
val mutableList1: MutableList<Int> = mutableListOf(1,2,3,4,5)
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
val mutableList2: MutableList<Int> = mutableListOf(1,2,3,4,5)
mutableList2.add(6)
mutableList2.add(7)
mutableList2.add(8)
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
val mutableList3: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
mutableList3.remove("World")
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
val readOnlyList3: List<Int> = listOf(1, 2, 3)
for (i in readOnlyList3) {
    println(i)
}
//Создайте список строк и получите из него второй элемент, используя его индекс.
val readOnlyList4: List<String> = listOf("Hello", "World", "Kotlin")
println(readonlyList4[2])
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
val readOnlyList4: List<Int> = listOf(1, 2, 3)
readOnlyList4[2] = "Python"
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
val mutableList4: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
val mutableList5: MutableList<String> = mutableListOf("1","2","3")
for (i in mutableList5) {
    mutableList4.add(i)
}
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun maxmin() {
    val List6 = intArrayOf(1,2,3,4,5)
    println(List6.maxOrNull())
    println(List6.minOrNull())
}
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
val List7 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
val List8: MutableList<Int> = mutableListOf()
for (i in List7) {
    if (i%2==0) {
        List8.add(i)
    }
}

//Работа с Множествами Set
//Создайте пустое неизменяемое множество целых чисел.
val numbers1: Set<Int> = setOf()
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
val numbers2: Set<Int> = setOf(1,2,3)
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
val numbers3: Set<String> = setOf("Kotlin", "Java", "Scala")
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
numbers3.add("Swift")
numbers3.add("Go")
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
val mutableNumbersSet1: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
mutableNumbersSet1.remove(2)
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
val mutableNumbersSet1: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
for (i in mutableNumbersSet1) {
    println(i)
}
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть.
//Реши задачу через цикл.
fun setcheck(strings: Set<String>, search: String) {
    for (i in strings) {
        println(search in i)
    }
}
//Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
val stringSet: Set<String> = setOf("1","2","3")
val stringList: MutableList<String> = mutableListOf()
for (item in stringSet) {
    stringList.add(item)
}




fun main() {
}