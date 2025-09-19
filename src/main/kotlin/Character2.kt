package org.example

fun main(args: Array<String>) {
    var charA: Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.lowercaseChar())
    var strA: String = charA.toString()
    println("Kini charA sudah menjadi String : " + strA)
}