package com.example.exposicion_grupo_3.If

/*
* AUTOR: Jesus David Lara Pineda
* */


class Evaluador {

    // Función que evalúa si el número es positivo o negativo
    fun evaluarNumero(numero: Int): String {

        if (numero >= 0) {
            return "El numero es positivo"
        }


        return "El numero es negativo"
    }

}