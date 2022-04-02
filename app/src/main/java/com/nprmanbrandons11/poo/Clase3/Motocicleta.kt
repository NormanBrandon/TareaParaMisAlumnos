package com.nprmanbrandons11.poo.Clase3

import com.nprmanbrandons11.poo.Clase2.TransporteTerrestre
import com.nprmanbrandons11.poo.Clase4.DiseñoLimpio

class Motocicleta(var llantas:Int,
                  var marca: String ,
                  var color: String ,
                  var potencia: Int ,
                  var velocidad: Double,
                  var kmPorLitro:Int,val mecanico: Mecanico) : DiseñoLimpio

{
    var enCondiciones:Boolean = false

    init {
        enCondiciones = mecanico.revisarMoto()
        arrancar()
    }

    fun arrancar(){

        println("moto ${marca} Calentando Motor")
    }
    fun acelerar(aceleracion:Double){
        if (enCondiciones){
        velocidad = aceleracion*1 + velocidad
        println("moto $marca acelerando, velocidad actual $velocidad")
        }
        else println("moto $marca No se puede andar, porque la moto es peligrosa, reparela")
    }

    fun frenar(){
        if(velocidad >27)
            println("Moto $marca Frenado repentino, muerte segura")
        else
        println("moto ${marca} Frenando, deteniendose")
    }

    override fun lavar(): Boolean {
        return true
    }

    override fun pulir(): Boolean {
        println("puliendo motocicleta")
        return true
    }


}