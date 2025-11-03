package org.example.lessons.lesson16.homeworks

const val RESET = "\u001B[0m"
const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val BLUE = "\u001B[34m"

// Базовый класс
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// Подклассы с переопределением
class Dog : Animal() {
    override fun makeSound() {
        println("${RED}Bark$RESET")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("${GREEN}Meow$RESET")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("${BLUE}Tweet$RESET")
    }
}

// Главная функция
fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())

    for (animal in animals) {
        animal.makeSound()
    }
}