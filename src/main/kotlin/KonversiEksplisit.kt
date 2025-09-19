package org.example

fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt
    println("Konversi variabel vaLint secara implisit : " + valSum)
    val valLong: Long = valInt.toLong()
    println("Konversi variabel vaLint secara eksplisit : " + valLong)
}