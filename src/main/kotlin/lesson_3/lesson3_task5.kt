package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val from = move.substringBefore("-")
    val to = move.substringAfter("-").substringBefore(";")
    val count = move.substringAfter(";").toInt()
    println(from)
    println(to)
    println(count)
}