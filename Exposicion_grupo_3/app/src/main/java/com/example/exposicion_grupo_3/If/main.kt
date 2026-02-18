package com.example.exposicion_grupo_3.If

/*
* AUTOR: Jesus David Lara Pineda
* */


fun main() {

    // Crear objeto de la clase
    val evaluador = Evaluador()

    // Número de ejemplo
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()

    // Llamar función
    val resultado = evaluador.evaluarNumero(numero)

    // Mostrar resultado
    println(resultado)

}