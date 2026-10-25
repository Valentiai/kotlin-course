package org.example.lessons.lesson15.homeworks

// Базовый класс
open class GeometricFigure(
    val name: String
) {
    open fun describe() {
        println("Это геометрическая фигура: $name")
    }
}

// Производный класс — Многоугольник
open class Polygon(name: String, val sides: Int) : GeometricFigure(name) {
    override fun describe() {
        println("Это многоугольник с $sides сторонами")
    }
}

// Класс — Круг
class Circle(val radius: Double) : GeometricFigure("Круг") {
    override fun describe() {
        println("Это круг с радиусом $radius")
    }
}

// Класс — Треугольник (наследник Многоугольника)
class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) :
    Polygon("Треугольник", 3) {
    override fun describe() {
        println("Это треугольник со сторонами $sideA, $sideB и $sideC")
    }
}

// Класс — Четырехугольник (наследник Многоугольника)
class Quadrilateral(val sideA: Double, val sideB: Double, val sideC: Double, val sideD: Double) :
    Polygon("Четырехугольник", 4) {
    override fun describe() {
        println("Это четырехугольник со сторонами $sideA, $sideB, $sideC и $sideD")
    }
}