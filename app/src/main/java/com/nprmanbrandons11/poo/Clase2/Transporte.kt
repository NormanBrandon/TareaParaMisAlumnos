package com.nprmanbrandons11.poo.Clase2

abstract class TransporteTerrestre( id:String, var velocidad:Double = 0.0) {
    open var id :String? = null
    init {
        this.id = id
        this.arrancar()
    }

    fun acelerar(aceleracion:Int){
        velocidad = calcularVelocidad(this@TransporteTerrestre.velocidad,aceleracion)
        print("Acelerando ")
        println("Velocidad Actual $velocidad")
    }
    open fun arrancar(){
        println("Arrancando Transporte Terrestre")
    }
    open fun viajar(){
        println("Transporte Viajando")
    }
    open fun viajar(destino:String){
        println("Transporte Viajando $destino")
    }
    private fun calcularVelocidad(velocidad: Double,aceleracion: Int) :Double {
        return velocidad + aceleracion * 1
    }

    abstract fun llenarGasolina(tipoDeGasolina:String)
}