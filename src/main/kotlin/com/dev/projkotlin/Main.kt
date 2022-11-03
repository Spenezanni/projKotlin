package com.dev.projkotlin

class Invoice {
}

class Empty

class Person(var firstName: String, val lastName: String){

    var completeName: String = ""

    init {
        println("Init Block: firstName = $firstName, lastName = $lastName")
        this.completeName = "$firstName $lastName"
    }
}

fun main() {
    val i = Invoice()
    println(i)

    val e = Empty()
    println(e)

    val p = Person("Luiz", "Silva")
    println(p)
    println(p.firstName)
    println(p.lastName)
    println(p.completeName)
}
