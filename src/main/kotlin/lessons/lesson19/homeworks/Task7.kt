package org.example.lessons.lesson19.homeworks

class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean {
        return !item.isNullOrBlank()
    }
}