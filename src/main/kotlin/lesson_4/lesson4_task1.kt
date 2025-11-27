package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesReservedToday < NUMBER_OF_TABLES}," +
            "\nДоступность столиков на завтра: ${tablesReservedTomorrow < NUMBER_OF_TABLES}.")
}