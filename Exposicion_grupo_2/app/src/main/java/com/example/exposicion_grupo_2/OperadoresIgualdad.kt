package com.example.exposicion_grupo_2

/*
* AUTOR: Jesus David Lara Pineda
* */

fun main() {

    val juego = NumeroSecreto()
    println("Ingrese su numero: ")
    val num = readln().toInt()
    println("El numero que usted ingreso: ${juego.verificarNumero(num)}")
    println("El numero correcto es: ${juego.verificarNumero(num)}")
}

class NumeroSecreto {

    private val numeroSecreto = 7

    fun verificarNumero(numero: Int): Boolean {
        return numero == numeroSecreto
    }
}