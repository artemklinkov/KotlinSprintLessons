package org.example.lesson_5

const val HUNDRED_KM = 100

fun main() {
    println("Введите расстояние в километрах:")
    val distance = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах):")
    val consumption = readln().toDouble()
    println("Введите текущую цену за литр топлива:")
    val price = readln().toDouble()

    val gasTotal = (distance * consumption) / HUNDRED_KM
    val sumTotal = gasTotal * price

    println("""
        Необходимое количество топлива: ${"%.2f".format(gasTotal)}
        Общая стоимость топлива: ${"%.2f".format(sumTotal)}
    """.trimIndent())
}