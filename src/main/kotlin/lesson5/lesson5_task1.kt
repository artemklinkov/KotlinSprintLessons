package org.example.lesson5

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 10)
    val b = Random.nextInt(0, 10)

    println("Для продолжения решите математическую задачу: $a + $b = ?")
    val userAnswer = readln().toInt()
    val correctAnswer = a + b
    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}