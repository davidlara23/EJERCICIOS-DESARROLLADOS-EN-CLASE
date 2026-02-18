package com.example.exposicion_grupo_1
/*
* AUTOR: Jesus David Lara Pineda
* */
class Rectangulo(val base: Double, val altura: Double) {

    fun calcularArea(): Double {
        return base * altura
    }
}

fun main() {
    val rect = Rectangulo(5.0, 3.0)
    println("El área es: ${rect.calcularArea()}")
}