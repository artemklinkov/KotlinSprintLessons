package org.example.lesson_4
    const val HUMIDITY_THRESHOLD = 20
    const val DEFAULT_SEASON = "Winter"
fun main() {
    val isSunny = true
    val isOpened = true
    val humidity = 20
    val season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny && isOpened && humidity == HUMIDITY_THRESHOLD && season != DEFAULT_SEASON}")
}