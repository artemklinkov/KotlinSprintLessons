package org.example.lesson_4

fun main() {
    val isBroken = readln().toBoolean()
    val crewCount = readln().toInt()
    val foodBoxesCount = readln().toInt()
    val isWeatherConditionGood = readln().toBoolean()

    val isItPossibleToSail = !isBroken && crewCount >= 55 && crewCount <= 70 && foodBoxesCount >= 50
            || crewCount == 70 && isWeatherConditionGood && foodBoxesCount >= 50

    println(isItPossibleToSail)
}