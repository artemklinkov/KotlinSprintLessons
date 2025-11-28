package org.example.lesson_4

const val WEIGHT_LOWER = 35
const val WEIGHT_UPPER = 100
const val VOLUME_UPPER = 100

fun main() {
    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${weight > WEIGHT_LOWER && weight <= WEIGHT_UPPER && volume < VOLUME_UPPER}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${weight > WEIGHT_LOWER && weight <= WEIGHT_UPPER && volume < VOLUME_UPPER}")

}