package org.example.lesson5

import kotlin.random.Random

fun main() {
    val numbers = listOf<Int>(Random.nextInt(0, 42), Random.nextInt(0, 42), Random.nextInt(0, 42))
    println("Введите числа: ")
    val userNumbers = listOf<Int>(readln().toInt(), readln().toInt(), readln().toInt())

    val winNumbers = numbers.intersect(userNumbers)

    val result = when (winNumbers.size) {
        3 -> "Джэкпот! Вы угадали все числа!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа. Попробуйте испытать удачу в другой раз."
    }

    println(result)
    println(numbers.joinToString(
        separator = " ",
        prefix = "Выпавшие числа: ",
        postfix = "."
    ))
}