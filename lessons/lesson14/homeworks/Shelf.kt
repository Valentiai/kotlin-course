package org.example.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    fun addItem(item: String): Boolean {
        val used = items.sumOf { it.length }
        if (used + item.length <= capacity) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun canAccommodate(item: String): Boolean {
        val used = items.sumOf { it.length }
        return used + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun remainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}