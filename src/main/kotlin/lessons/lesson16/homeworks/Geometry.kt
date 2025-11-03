package org.example.lessons.lesson16.homeworks

import kotlin.math.*

// Абстрактный базовый класс
abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

// Класс Круг
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Класс Квадрат
class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Класс Треугольник (по двум сторонам и углу между ними)
class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val angleDegrees: Double
) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * sideA * sideB * sin(angleRadians)
    }
}

// Главная функция
fun main() {
    val shapes: List<Shape> = listOf(
        Circle(3.0),
        Square(4.0),
        Triangle(5.0, 6.0, 30.0),
        Triangle(3.0, 4.0, 90.0)
    )

    for (shape in shapes) {
        println("Площадь фигуры: ${"%.2f".format(shape.area())}")
    }
}