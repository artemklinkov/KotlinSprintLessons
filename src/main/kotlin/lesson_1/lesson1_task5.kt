package org.example.lesson_1

fun main() {
    val secondsCount: Int = 1 * 60 * 60 + 30 * 60 + 9
    val hours: Int = secondsCount / 3600
    val minutes: Int = (secondsCount % 3600) / 60
    val seconds: Int = secondsCount % 60
    println("${"%02d".format(hours)}:${"%02d".format(minutes)}:${"%02d".format(seconds)}")
}