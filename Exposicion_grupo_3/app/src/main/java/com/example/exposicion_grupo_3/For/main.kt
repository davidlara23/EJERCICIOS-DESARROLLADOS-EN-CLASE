package com.example.exposicion_grupo_3.For

/*
* AUTOR: Jesus David Lara Pineda
* */


fun main() {

    val contador = Contador()

    print("Ingrese un numero: ")

    val numero = readLine()!!.toInt()

    contador.contar(numero)

}
