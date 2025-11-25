package org.example.lesson_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val duration = 457
    val minutesInHour = 60
    val endHour = (startHour * minutesInHour + startMinute + duration) / minutesInHour
    val endMinute = (startHour * minutesInHour + startMinute + duration) % minutesInHour

    print("%02d:%02d".format(endHour, endMinute))
}