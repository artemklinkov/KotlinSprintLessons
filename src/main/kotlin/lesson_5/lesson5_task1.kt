package org.example.lesson5

fun main() {
    val firstOperand = (0..10).random()
    val secondOperand = (0..10).random()

    println("Для продолжения решите математическую задачу: " +
            "$firstOperand + $secondOperand = ?")
    val userAnswer = readln().toInt()
    val correctAnswer = firstOperand + secondOperand

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}