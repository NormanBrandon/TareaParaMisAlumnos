package com.nprmanbrandons11.poo.Clase2

import com.nprmanbrandons11.poo.Clase3.Mecanico
import com.nprmanbrandons11.poo.Clase3.Motocicleta
import com.nprmanbrandons11.poo.Clase3.Persona
import com.nprmanbrandons11.poo.Clase3.Usuario
import com.nprmanbrandons11.poo.Clase4.CardType

fun main(){
    val mecanico = Mecanico("Jorge")
    //val persona = Persona() clase abstracta no instanciable

    val motoItalica = Motocicleta(2, potencia = 200,
                                    marca = "Italica",color = "Azul",
                                    velocidad = 10.0,kmPorLitro =  30,
                                    mecanico = Mecanico("Juan"))

    val motoHarley = Motocicleta(2,"Harley", "negra,",300,20.0,21,mecanico)

    print("${motoItalica.velocidad}\n${motoItalica.marca}\n${motoItalica.color}\n" +
            "${motoItalica.kmPorLitro}\n"+"${motoItalica.potencia}\n ${motoItalica.llantas}\n")

    motoHarley.acelerar(10.0)
    motoHarley.frenar()
    motoItalica.frenar()
    motoHarley.pulir()

    ///

   println("////////////////////////////////////////////////////////////////////////////////////")
   println("${mecanico.nombre},${mecanico.edad}")
    mecanico.respirar()
    mecanico.trabajar()
    mecanico.comer()
    val auto:Automovil = Automovil("7D-988",0.0)
    println("////////////////////////////////////////////////////////////////////////////////////")

    auto.viajar("A venecia")
    auto.arrancar()

    val norman  = Usuario(1,"Norman Brandon",24,false)
    println("${norman.name} \n ${norman.age} ")

}

