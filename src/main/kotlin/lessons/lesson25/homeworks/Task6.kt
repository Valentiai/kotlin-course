package org.example.lessons.lesson25.homeworks

fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}