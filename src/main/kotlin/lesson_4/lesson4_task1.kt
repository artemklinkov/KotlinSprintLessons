package org.example.lesson_4

fun main() {
    val tables = 13
    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9

    println("Доступность столиков на сегодня: ${tables > tablesReservedToday},\nДоступность столиков на завтра: ${tables > tablesReservedTomorrow}.")
}