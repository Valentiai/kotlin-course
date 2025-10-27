package org.example.lessons.lesson14.homeworks

class Emotion(val type: String, val Intensity: Int) {
//Аспект реальности: эмоция.
//Создайте класс Emotion, который представляет эмоцию.
//У него должно быть свойство type (String) и intensity (Int).
//Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
    fun express() {
        println("Эмоция: $type, Сила: $Intensity")
    }
}