package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70_000
    val percentage = 16.7
    val duration = 20
    val total = sum * (1 + percentage / 100).pow(duration)
    println("%.3f".format(total))
}