package com.example.exposicion_grupo_1
/*
* AUTOR: Jesus David Lara Pineda
* */
class Persona(val nombre:String, val edad:Int) {
    val mensaje = "Hola, mi nombre es " + nombre + " y tengo $edad anios."
}

fun main() {
    val persona = Persona("Tomy",20)

    println(persona.mensaje)
}