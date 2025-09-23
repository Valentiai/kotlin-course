package org.example.lessons.lesson07.homeworks

//Задания для цикла for
//Прямой диапазон
fun task1() {
    for (i in 1..9) {
        println(i)
    }
}

fun task2() {
    for (i in 1..10) {
        if (i%2==0) {
            println(i)
        }
    }
}

//Обратный диапазон
fun task3() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

fun task4() {
    for (i in 10 downTo 1) {
        println(i-2)
    }
}

//С шагом (step)
fun task5() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

fun task6() {
    for (i in 1..20 step 3) {
        println(i)
    }
}

//Использование до (until)
fun task7(size: Int) {
    for (i in 3 until size step 2) {
        println(i)
    }
}

//Задания для цикла while
//Цикл while
fun task8() {
    var start: Int = 1
    while (start++<5) {
        println(start*start)
    }
}

fun task9() {
    var start: Int = 10
    while (start-->50) {
        println(start)
    }
}

//Цикл do while
fun task10() {
    var start: Int = 5
    do {
        println(start)
    }
    while (start-->1)
}

fun task11() {
    var start: Int = 5
    do {
        println(start)
    }
    while (start++<10)
}

//Задания для прерывания и пропуска итерации
//Использование break

fun task12() {
    for (i in 1..10) {
        if (i==6) break
        println(i)
    }
}

fun task13() {
    var start: Int = 1
    while (true) {
        if (start==10) break
        println(start++)
    }
}

//Использование continue
fun task14() {
    for (i in 1..10) {
        if (i%2==0) continue
        println(i)
    }
}

fun task15() {
    var start: Int = 1
    while (start++<10) {
        if (start%3==0) continue
        println(start)
    }
}

//Доп задачи
fun task16() {
    for (i in 1..10) {
        for (j in 1..10) {
            print(i*j)
            print(" ")
        }
        println()
    }
}

fun task17(arg: Int) {
    var total: Int = 0
    for (i in 1..arg) {
        total = total + i
        println(total)
    }
}

fun task18(arg: Int) {
    var start: Int = 1
    var count: Int = 1
    while (count<=arg) {
        start *= count
        count += 1
    }
    println(start)
}

fun task19(arg: Int) {
    var start: Int = 0
    var count: Int = 2
    while (count<=arg) {
        start += count
        count += 2

    }
    println(start)
}

fun task20(row: Int = 5, col: Int = 3) {
    var a: Int = 0
    while (a<row) {
        var b: Int = 0
        while (b<col) {
            print("*")
            b++
        }
        a++
        println()
    }
}

fun task21(arg: Int) {
    var even: Int = 0
    var odd: Int = 0
    for (i in 1..arg) {
        if (i%2==0) {
            even+=i
        }
        else {
            odd+=i
        }
    }
    println(even)
    println(odd)
}
fun main() {

}