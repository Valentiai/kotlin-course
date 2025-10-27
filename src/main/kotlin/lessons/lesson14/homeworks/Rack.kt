package org.example.lessons.lesson14.homeworks

class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): List<String> {
        if (index >= 0 && index < shelves.size) {
            val shelf = shelves.removeAt(index)
            return shelf.getItems()
        }
        return emptyList()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(item)) {
                return true
            }
        }
        return false
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("Содержимое стеллажа:")
        for (i in shelves.indices) {
            val shelf = shelves[i]
            println("Полка №$i: вместимость = ${shelf.capacity}, свободно = ${shelf.remainingCapacity()}, предметы = ${shelf.getItems()}")
        }
        println()
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }

        val shelf = shelves[index]
        val items = shelf.getItems().sortedByDescending { it.length }
        val notPlaced = mutableListOf<String>()

        for (item in items) {
            var placed = false
            for (i in shelves.indices) {
                if (i != index && shelves[i].canAccommodate(item)) {
                    shelves[i].addItem(item)
                    placed = true
                    break
                }
            }
            if (!placed) {
                notPlaced.add(item)
            }
        }

        shelves.removeAt(index)
        return notPlaced
    }
}