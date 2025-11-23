package org.example.lesson_4

fun main() {
    val isSunny = true
    val isOpened = true
    val humidity = 20
    val season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isOpened && humidity == 20 && season != "Winter"}")
}