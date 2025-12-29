package org.example.lessons.lesson31.homeworks

class PhoneNumberFormatter {

    fun formatPhoneNumber(input: String): String {
        // Убираем всё, кроме цифр
        val digits = input.filter { it.isDigit() }

        // Проверяем длину и код страны
        val normalized = when {
            digits.length == 11 && digits.startsWith("8") ->
                "7" + digits.substring(1)

            digits.length == 11 && digits.startsWith("7") ->
                digits

            else -> throw IllegalArgumentException("Invalid phone number")
        }

        val operatorCode = normalized.substring(1, 4)
        val firstPart = normalized.substring(4, 7)
        val secondPart = normalized.substring(7, 9)
        val thirdPart = normalized.substring(9, 11)

        return "+7 ($operatorCode) $firstPart-$secondPart-$thirdPart"
    }
}
