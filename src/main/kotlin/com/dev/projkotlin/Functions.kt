package com.dev.projkotlin

fun calculadora(x: Int, y: Int, operador: String =  "+"): Int {
    println("$x $y = ${soma(x, y)}")
    return x + y
}

//fun soma(x: Int, y: Int): Int {
//    return x + y
//}

fun soma(x: Int, y: Int) = x + y

fun main() {
    val calc: Int = calculadora(10, 10)
    println(calc)
}