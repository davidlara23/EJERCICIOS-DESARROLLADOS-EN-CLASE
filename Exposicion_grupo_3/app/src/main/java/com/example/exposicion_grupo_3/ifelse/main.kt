package com.example.exposicion_grupo_3.ifelse

/*
* AUTOR: Jesus David Lara Pineda
* */


fun main() {

    val persona = mayorEdad()

    print("Ingrese su edad: ")

    val edad = readLine()!!.toInt()

    val resultado = persona.verificarEdad(edad)

    println(resultado)

}
