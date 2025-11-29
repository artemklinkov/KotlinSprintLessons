package org.example.lesson5

import kotlin.math.pow

const val MIN_IMT = 18.5
const val AVG_IMT = 25.0
const val MAX_IMT = 30.0
const val CM_IN_M = 100
fun main() {
    println("Введите Ваш вес в килограммах:")
    val weight = readln().toDouble()
    println("Введите Ваш рост в сантиметрах:")
    val height = readln().toDouble()

    val bodyIndex = weight / (height / CM_IN_M).pow(2)

    val result = when {
        bodyIndex < MIN_IMT -> "Недостаточная масса тела"
        bodyIndex in MIN_IMT..<AVG_IMT -> "Нормальная масса тела"
        bodyIndex in AVG_IMT..<MAX_IMT -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println(result)
    println("%.2f".format(bodyIndex))
}