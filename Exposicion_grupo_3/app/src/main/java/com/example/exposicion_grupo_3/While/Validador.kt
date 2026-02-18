package com.example.exposicion_grupo_3.While

/*
* AUTOR: Jesus David Lara Pineda
* */


class Validador {
    fun iniciarSesion() {

        val claveCorrecta = "1234"
        var clave = ""

        while (clave != claveCorrecta) {

            print("Ingrese la contrasena: ")

            clave = readLine()!!

            if (clave != claveCorrecta) {

                println("Contrasena incorrecta")

            }

        }

        println("Acceso permitido")

    }

}