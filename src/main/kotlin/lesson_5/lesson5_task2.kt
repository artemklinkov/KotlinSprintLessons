package org.example.lesson5

import java.time.Year

fun main() {
    println("Введите Ваш год рождения:")
    val yearOfBirth = readln().toInt()
    val yearNow = Year.now().value
    val minimalAge = 18

    if (yearNow - yearOfBirth >= minimalAge) println("Показать экран со скрытым контентом")
}