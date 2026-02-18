package com.example.exposicion_grupo_2

/*
* AUTOR: Jesus David Lara Pineda
* */

class Contador {

    var numero: Int = 8

    fun incrementar() {
        numero++
    }
}


fun main(){
    val cont = Contador()
    println("Valor inicial: ${cont.numero}")
    cont.incrementar()
    println("Vaor final: ${cont.numero}")
}
