package org.example.lesson_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val duration = 457
    val endHour = (startHour * 60 + startMinute + duration) / 60
    val endMinute = (startHour * 60 + startMinute + duration) % 60

    print("${"%02d".format(endHour)}:${"%02d".format(endMinute)}")
}