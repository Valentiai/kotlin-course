package org.example.lessons.lesson19.homeworks

class OddValidator : Validator<Int> {
    override fun validate(item: Int): Boolean {
        return item % 2 == 0
    }
}