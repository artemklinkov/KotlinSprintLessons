package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOODBOX = 50

fun main() {
    val isBroken = readln().toBoolean()
    val crewCount = readln().toInt()
    val foodBoxesCount = readln().toInt()
    val isWeatherConditionGood = readln().toBoolean()

    val isItPossibleToSail = !isBroken && crewCount >= MIN_CREW && crewCount <= MAX_CREW && foodBoxesCount > MIN_FOODBOX
            || isBroken && crewCount == MAX_CREW && isWeatherConditionGood && foodBoxesCount >= MIN_FOODBOX

    println(isItPossibleToSail)
}