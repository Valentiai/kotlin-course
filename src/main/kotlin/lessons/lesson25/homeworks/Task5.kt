package org.example.lessons.lesson25.homeworks

fun main() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = person.run {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }
}