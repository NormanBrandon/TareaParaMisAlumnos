package com.nprmanbrandons11.poo.Clase3



class Mecanico(nombreMecanico:String) : Persona() {

    init {
        this.nombre = nombreMecanico
        this.edad = 50
    }

    fun revisarMoto():Boolean{
        return false
    }

    override fun trabajar() {

        println("Mecanico trabajando a su manera")
    }

    override fun respirar() {
        println("Mecanico Respirando a su manera")
   }
}