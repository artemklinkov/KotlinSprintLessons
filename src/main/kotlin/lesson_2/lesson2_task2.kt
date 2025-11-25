package org.example.lesson_2

fun main() {
    val workersCount = 50
    val workerSalary = 30000
    val internsCount = 30
    val internSalary = 20000
    val totalWorkersSalary = workersCount * workerSalary
    val totalSalary = totalWorkersSalary + internsCount * internSalary
    val averageSalary = totalSalary / (workersCount + internsCount)
    println("Total salary: $totalSalary")
    println("Total workers salary: $totalWorkersSalary")
    println("Average salary: $averageSalary")
}