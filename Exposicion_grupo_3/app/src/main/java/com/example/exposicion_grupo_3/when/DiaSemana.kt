package com.example.exposicion_grupo_3.`when`

/*
* AUTOR: Jesus David Lara Pineda
* */


class DiaSemana {

    fun obtenerDia(numero: Int): String {

        return when (numero) {

            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"

            else -> "Numero invalido"

        }

    }

}
