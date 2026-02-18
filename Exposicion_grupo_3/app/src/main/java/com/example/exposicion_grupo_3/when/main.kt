package com.example.exposicion_grupo_3.`when`

/*
* AUTOR: Jesus David Lara Pineda
* */


fun main() {

    val dia = DiaSemana()

    print("Ingrese un numero del 1 al 7 para determinar el dia de la semana: ")

    val numero = readLine()!!.toInt()

    val resultado = dia.obtenerDia(numero)

    println(resultado)

}
