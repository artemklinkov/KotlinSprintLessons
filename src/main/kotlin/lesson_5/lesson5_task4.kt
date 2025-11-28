package org.example.lesson5

fun main() {
    val predefinedUser = "Zaphod"
    val predefinedPassword = "PanGalactic"
    println("Введите имя пользователя:")

    val user = readln()

    if (user == predefinedUser) {
        println("Введите пароль:")
        val password = readln()
        if (password == predefinedPassword) {
            println("Пользователь \"${user}\", вам разрешено входить на борт корабля \"Heart of Gold\".")
        } else {
            println("Неверный пароль. Пользователь \"${user}\", вам запрещено входить на борт корабля \"Heart of Gold\".")
        }
    } else {
        println("Вам необходимо зарегистрироваться")
    }
}