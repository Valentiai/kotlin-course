package org.example.lessons.lesson16.homeworks

class Cart {
    // Словарь: ключ - ID товара, значение - количество
    private val items = mutableMapOf<Int, Int>()

    // 1️⃣ Добавление одного товара по ID
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // 2️⃣ Добавление товара с указанием количества
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // 3️⃣ Добавление словаря товаров
    fun addToCart(newItems: Map<Int, Int>) {
        for ((id, qty) in newItems) {
            items[id] = items.getOrDefault(id, 0) + qty
        }
    }

    // 4️⃣ Добавление списка ID (по одному товару каждого ID)
    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }

    // Красивый вывод корзины
    override fun toString(): String {
        val builder = StringBuilder()
        builder.appendLine("ID товара | Количество")
        builder.appendLine("--------------------")
        var totalItems = 0
        var totalQuantity = 0
        for ((id, qty) in items) {
            builder.appendLine(String.format("%9d | %10d", id, qty))
            totalItems++
            totalQuantity += qty
        }
        builder.appendLine("--------------------")
        builder.appendLine("Всего артикулов: $totalItems")
        builder.appendLine("Общее количество товаров: $totalQuantity")
        return builder.toString()
    }
}

// Проверка
fun main() {
    val cart = Cart()

    // 1️⃣ Добавляем один товар
    cart.addToCart(101)

    // 2️⃣ Добавляем один товар с количеством
    cart.addToCart(102, 3)

    // 3️⃣ Добавляем словарь товаров
    cart.addToCart(mapOf(103 to 2, 101 to 4))

    // 4️⃣ Добавляем список ID товаров (по одной единице)
    cart.addToCart(listOf(104, 105, 101))

    // Печатаем корзину
    println(cart)
}