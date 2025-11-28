package org.example.lesson5

import kotlin.random.Random

fun main() {
    val numbers = intArrayOf(Random.nextInt(0, 42),
        Random.nextInt(0, 42))
    println("Введите числа от 0 до 42:")
    val userFirstNumber = readln().toInt()
    val userSecondNumber = readln().toInt()

    val result = when {
        userFirstNumber in numbers && userSecondNumber in numbers  -> "Поздравляем! Вы выиграли главный приз!"
        userFirstNumber in numbers || userSecondNumber in numbers -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(result)
    println("Выигрышные номера: ${numbers.joinToString(", ")}")
}