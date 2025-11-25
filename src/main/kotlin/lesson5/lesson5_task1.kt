package org.example.lesson5

fun main() {
    println("Для продолжения решите математическую задачу: 2 + 3 = ?")
    val userAnswer = readln().toInt()
    val correctAnswer = 5
    if (userAnswer ==  correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}