package org.example.lesson_2

fun main() {
    val diamonds = 7
    val metal = 11
    val buff = 20
    val percent = 100

    val diamondsWithBuff = diamonds * buff / percent
    val metalWithBuff = metal * buff / percent

    println("%d".format(diamondsWithBuff))
    println("%d".format(metalWithBuff))
}