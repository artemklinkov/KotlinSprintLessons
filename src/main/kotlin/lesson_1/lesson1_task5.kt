package org.example.lesson_1

fun main() {
    val secondsInOneMinute: Int = 60
    val seconds: Int = 6480
    val hours: Int = seconds / (secondsInOneMinute * secondsInOneMinute)
    val minutes: Int = (seconds % (secondsInOneMinute * secondsInOneMinute)) / secondsInOneMinute
    val secondsForPrint: Int = seconds % secondsInOneMinute
    println("%02d:%02d:%02d".format(hours, minutes, secondsForPrint))
}