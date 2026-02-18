package com.example.exposicion_grupo_3.ifelse

/*
* AUTOR: Jesus David Lara Pineda
* */

class mayorEdad {
    fun verificarEdad(edad: Int): String {

        if (edad >= 18) {
            return "Eres mayor de edad"
        } else {
            return "Eres menor de edad"
        }

    }
}