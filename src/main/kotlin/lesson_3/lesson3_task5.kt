package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val list = move.split("-", ";")

    val from = list[0]
    val to = list[1]
    val count = list[2].toInt()
    println(from)
    println(to)
    println(count)
}