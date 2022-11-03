package com.dev.projkotlin

open class Base(val name: String)

class Delivered(name: String, val cpf: String): Base(name){
    init {
        println("Init: ${super.name}")
    }
}

fun main() {

    val base = Base("Luiz")
    println(base.name)

    val delivered = Delivered("Luiz", "1234")
    println("${delivered.name}, ${delivered.cpf}")

}