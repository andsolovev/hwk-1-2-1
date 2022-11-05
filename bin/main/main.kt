package ru.netology

fun main() {
    val fee: Double = 0.0075
    val minFee: Int = 35
    val amount: Int = 10000


    val totalFee = amount * fee
    val result = if (totalFee > minFee) totalFee else minFee

    println(result)
}