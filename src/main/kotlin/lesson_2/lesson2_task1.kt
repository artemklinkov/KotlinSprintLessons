package org.example.lesson_2

fun main() {
    val mark1 = 3.0f
    val mark2 = 4.0f
    val mark3 = 3.0f
    val mark4 = 5.0f
    val count = 4
    val avg: Float = (mark1 + mark2 + mark3 + mark4) / count
    println("%.2f".format(avg))
}