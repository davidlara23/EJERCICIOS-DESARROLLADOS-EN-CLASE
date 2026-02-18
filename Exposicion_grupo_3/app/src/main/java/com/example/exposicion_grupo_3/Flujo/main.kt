package com.example.exposicion_grupo_3.Flujo

/*
* AUTOR: Jesus David Lara Pineda
* */


fun main() {

    val control = ControlFlujo()

    print("Ingrese un numero: ")

    val numero = readLine()!!.toInt()

    control.ejemplo(numero)

}
