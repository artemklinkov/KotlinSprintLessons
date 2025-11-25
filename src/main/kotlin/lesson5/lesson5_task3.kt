package org.example.lesson5

fun main() {
    val numbers = intArrayOf(10, 20)
    println("Введите числа:")
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