package com.nprmanbrandons11.poo.Clase3

abstract class Persona() {
    var nombre:String? =  null
    var edad : Int = 0

    fun comer(){
        println("$nombre, está comiendo")
    }
    open fun trabajar(){
        println("$nombre esta trabajando")
    }

    abstract fun respirar()

}