package com.nprmanbrandons11.poo.Clase2


class Automovil(automovilId:String,velocidad:Double = 0.0): TransporteTerrestre(automovilId,velocidad) {

    override var id:String? = automovilId

    override fun viajar(){

        println("Automovil viajando")
    }

    override fun llenarGasolina(tipoDeGasolina: String) {
        println("Llenando tanque con gasolina del tipo :$tipoDeGasolina")
    }

    override fun arrancar() {
        super.arrancar()
        println("Automovil arrancando")
    }
}