package org.example.lesson5

fun main() {
    val a = (0..10).random()
    val b = (0..10).random()

    println("Для продолжения решите математическую задачу: $a + $b = ?")
    val userAnswer = readln().toInt()
    val correctAnswer = a + b

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}