package lessons.lesson31

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import org.junit.jupiter.api.Assertions.*

class PhoneNumberFormatterTest {

    @ParameterizedTest
    @MethodSource("validPhones")
    fun formatValidPhonesTest(source: String, expected: String) {
        val formatter = PhoneNumberFormatter()
        val actual = formatter.formatPhoneNumber(source)
        assertEquals(expected, actual)
    }

    @ParameterizedTest
    @ValueSource(strings = ["12345", "+1 (922) 941-11-11"])
    fun invalidPhoneTest(source: String) {
        val formatter = PhoneNumberFormatter()
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(source)
        }
    }


    companion object {

        @JvmStatic
        fun validPhones() = listOf<Any>(
            arrayOf("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            arrayOf("79229411111", "+7 (922) 941-11-11"),
            arrayOf("+7 922 941 11 11", "+7 (922) 941-11-11"),
            arrayOf("9229411111", "+7 (922) 941-11-11"),
            arrayOf("abc +7 922 941 11 11", "+7 (922) 941-11-11"),
        )
    }
}