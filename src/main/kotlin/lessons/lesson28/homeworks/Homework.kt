package org.example.lessons.lesson28.homeworks
import java.time.*
import kotlinx.datetime.DateTimeFormatter

fun main() {
    val t1 = Instant.now()
    println(t1)

    val t2 = LocalDate.of(1983, 10, 24)

    val t3 = Period.between(t2, LocalDate.now())
    println(t3.years)

    val date = LocalDate.of(2025, 4, 5)
    val time = LocalTime.of(15, 45, 12)
    printFormatted(date)
    printFormatted(time)
    printFormatted(LocalDateTime.of(date, time))
    printFormatted(ZonedDateTime.of(date, time, ZoneId.of("Europe/Amsterdam")))
    printFormatted(OffsetDateTime.of(LocalDateTime.of(date, time), ZoneOffset.of("+03")))
    LocalDate.of(2013, 12, 30).identifyGeneration()

    val t71 = LocalDate.of(2023, 2, 25)
    val t72 = LocalDate.of(2024, 2, 25)
    val formatter = DateTimeFormatter.ofPattern("MM-dd")
    println(t71.plusDays(10).format(formatter))
    println(t72.plusDays(10).format(formatter))
}

fun printFormatted(arg: Temporal) {
    when (arg) {
        is LocalDate -> "dd-MM-YYYY"
        is LocalTime -> "HH:mm:ss"
        is LocalDateTime -> "dd-MM-YYYY HH:mm:ss"
        is ZonedDateTime -> "dd-MM-YYYY HH:mm:ss z"
        is OffsetDateTime -> "dd-MM-YYYY HH:mm:ss ZZZ"
        else -> throw IllegalArgumentException("Неизвестный тип данных")
    }.let {
        DateTimeFormatter.ofPattern(it).format(arg)
    }.also { println(it) }
}

fun LocalDate.identifyGeneration() {
    when (this) {
        in 1946..1964 -> println("Это бумер!")
        in 1997..2012 -> println("Это зумер!")
        else -> println("Это обычный человек")
    }
}