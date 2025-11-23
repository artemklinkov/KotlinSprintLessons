package org.example.lesson_4

fun main() {
    val weight = 42
    val volume = 120

    val weightLower = 35
    val weightUpper = 100
    val volumeUpper = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > weightLower && weight <= weightUpper && volume < volumeUpper}")
}