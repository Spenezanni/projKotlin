package com.dev.projkotlin

class Person2(var firstName: String, val lastName: String) {

    //val completeName: String = "Complete Name: $firstName $lastName"

    val completeName: String
        get() = "Complete Name $firstName $lastName"

    var age: Int = 0
        set(value){
            field = value
        }

    init {
        println("firstName: $firstName, lastName: $lastName")
    }
}

fun main() {
    val p = Person2("Luiz", "Silva")
    println(p)
    p.firstName = "Luizzz"
    println(p.firstName)
    println(p.lastName)
    println(p.completeName)
    println(p.age)
}
