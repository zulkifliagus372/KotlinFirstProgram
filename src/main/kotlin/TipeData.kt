package org.example

fun main(args: Array<String>) {
    val minByte: Byte = -128
    val maxByte: Byte = 127
    val minShort: Short = -32768
    val maxShort: Short = 32767
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807

    println("minByte : " + minByte)
    println("maxByte : " + maxByte)
    println("minShort : " + minShort)
    println("maxShort : " + maxShort)
    println("minInt : " + minInt)
    println("maxInt : " + maxInt)
    println("minLong : " + minLong)
    println("maxLong : " + maxLong)
}