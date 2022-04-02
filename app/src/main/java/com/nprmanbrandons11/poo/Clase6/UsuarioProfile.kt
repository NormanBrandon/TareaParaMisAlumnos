package com.nprmanbrandons11.poo.Clase6

//PARA BASE DE DATOS, COMO ENTIDADES
//ROOM, usa entidades, que se traducen en tablas

//@Entity
data class UsuarioProfile(
    val id:Int,
    val name:String,
    val age:String,
    val country:String,
    val gender:String,
    val gallery:List<String>
)
