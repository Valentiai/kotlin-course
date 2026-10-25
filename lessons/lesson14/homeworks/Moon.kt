package org.example.lessons.lesson14.homeworks

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Луна сейчас видна. Текущая фаза: $phase")
        } else {
            println("Луна сейчас не видна на небе.")
        }
    }
}