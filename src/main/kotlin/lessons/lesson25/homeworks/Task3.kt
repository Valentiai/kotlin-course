package org.example.lessons.lesson25.homeworks

fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}

fun main() {
    val person = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }
}