package com.dev.projkotlin

data class User(val name: String, val age: Int)

fun main() {
    val user =  User("Luiz", 20)
    println(user)

    val user2 = User("Luiz", 20)
    println(user2)

    println(user == user2)
    
    val user3 = user.copy(age = 30)
    println(user3)
}