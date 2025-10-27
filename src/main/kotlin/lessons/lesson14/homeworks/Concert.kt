package org.example.lessons.lesson14.homeworks

class Concert(
    val band: String,
    val location: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun concertInfo() {
        println("Группа: $band")
        println("Место проведения: $location")
        println("Стоимость билета: $price")
        println("Вместимость зала: $capacity")
        println("Продано билетов: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет куплен! Продано билетов: $soldTickets из $capacity")
        } else {
            println("Билеты закончились!")
        }
    }
}