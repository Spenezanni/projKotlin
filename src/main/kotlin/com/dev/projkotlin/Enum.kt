package com.dev.projkotlin


enum class Estado(val descricao: String) {
    SP("São Paulo"),
    RJ("Rio de Janeiro")
}

enum class Pagamento(){
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    BOLETO
}

fun main() {
    println(Estado.SP)
    println(Estado.RJ)
    println(Estado.SP.name)
    println(Estado.SP.ordinal)
    println(Estado.RJ.ordinal)
    println(Estado.valueOf("SP"))
    println("-----------------------")
    Estado.values().forEach(::println)
    println(Estado.SP.descricao)
    println(Estado.RJ.descricao)
}
