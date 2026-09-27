//Задания для цикла for

//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
fun task1() {
    for (i in 1..5) {
        println(i)
    }
}
//Напишите цикл for, который выводит четные числа от 1 до 10.
fun task2() {
    for (i in 1..10) {
        if (i % 2 ==0) {
            println(i)
        }
    }
}
//Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
fun task3() {
    for (i in 5 downTo 1) {
        println(i)
    }
}
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun task4() {
    for (i in 10 downTo 1) {
        println(i-2)
    }
}
//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun task5() {
    for (i in 1..9 step 2) {
        println(i)
    }
}
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun task6() {
    for (i in 1..20 step 3) {
        println(i)
    }
}
//Использование до (until)
//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
fun task7(size: Int) {
    for (i in 3 until size step 2) {
        println(i)
    }
}


//Задания для цикла while
//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun task8(start: Int = 1) {
    var number = start
    while (number++ < 5) {
        println(number * number)
    }
}
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun task9() {
    var start: Int = 10
    while (start-->5) {
        println(start)
    }
}
//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
fun task10() {
    var start: Int = 5
    do {
        println(start)
    }
    while (start-->1)
}
//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun task11() {
    var start: Int = 5
    do {
        println(start)
    }
    while (start++<10)
}
//Задания для прерывания и пропуска итерации
//Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun task12() {
    for (i in 1..10) {
        if (i==6) break
        println(i)
    }
}
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun task13() {
    var start: Int = 1
    while (true) {
        if (start==10) break
        println(start++)
    }
}
//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
fun task14() {
    for (i in 1..10) {
        if (i%2==0) continue
        println(i)
    }
}
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun task15() {
    var start: Int = 1
    while (start++<10) {
        if (start%3==0) continue
        println(start)
    }
}
//Задача повышенной сложности (разбирается отдельно от основной домашки и награждается отдельным стимом за разбор).
//Её выполнять по желанию, проверка не выполняется.
//Используя вложенный цикл реализовать таблицу умножения, как на картинке.
fun task16() {
    for (i in 1..10) {
        for (j in 1..10) {
            print(i*j)
            print(" ")
        }
        println()
    }
}

//Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun task17(arg: Int) {
    var total: Int = 0
    for (i in 1..arg) {
        total = total + i
        println(total)
    }
}
//Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun task18(arg: Int) {
    var start: Int = 1
    var count: Int = 1
    while (count<=arg) {
        start *= count
        count += 1
    }
    println(start)
}
//Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun task19(arg: Int) {
    var start: Int = 0
    var count: Int = 2
    while (count<=arg) {
        start += count
        count += 2
    }
    println(start)
}
//Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
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
//Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
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
    task21()
}