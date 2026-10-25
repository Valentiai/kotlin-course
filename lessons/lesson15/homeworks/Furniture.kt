package org.example.lessons.lesson15.homeworks

// Базовый класс
open class Furniture(
    val name: String,
    val material: String
) {
    open fun describe() {
        println("Мебель: $name, материал: $material")
    }
}

// Производный класс — Стол
open class Table(name: String, material: String, val shape: String) :
    Furniture(name, material) {
    override fun describe() {
        println("Стол '$name', форма: $shape, материал: $material")
    }
}

// Производный класс — Стул
open class Chair(name: String, material: String, val hasBackrest: Boolean) :
    Furniture(name, material) {
    override fun describe() {
        println("Стул '$name', материал: $material, спинка: ${if (hasBackrest) "есть" else "нет"}")
    }
}

// Производный класс — Шкаф
open class Wardrobe(name: String, material: String, val doors: Int) :
    Furniture(name, material) {
    override fun describe() {
        println("Шкаф '$name' с количеством дверей: $doors, материал: $material")
    }
}

// Разветвление от Стола — Обеденный стол
class DiningTable(name: String, material: String, val seats: Int) :
    Table(name, material, "прямоугольный") {
    override fun describe() {
        println("Обеденный стол '$name', рассчитан на $seats человек, материал: $material")
    }
}

// Разветвление от Стола — Письменный стол
class WritingTable(name: String, material: String, val hasDrawers: Boolean) :
    Table(name, material, "прямоугольный") {
    override fun describe() {
        println("Письменный стол '$name', ящики: ${if (hasDrawers) "есть" else "нет"}, материал: $material")
    }
}

// Разветвление от Стула — Кресло
class Armchair(name: String, material: String, val isSoft: Boolean) :
    Chair(name, material, true) {
    override fun describe() {
        println("Кресло '$name', мягкость: ${if (isSoft) "мягкое" else "жесткое"}, материал: $material")
    }
}

// Разветвление от Шкафа — Гардероб
class Closet(name: String, material: String, val hasMirror: Boolean) :
    Wardrobe(name, material, 2) {
    override fun describe() {
        println("Гардероб '$name', зеркала: ${if (hasMirror) "есть" else "нет"}, материал: $material")
    }
}