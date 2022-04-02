package com.nprmanbrandons11.poo.Clase6

fun main(){
    val machi : UsuarioProfile = UsuarioProfile(1,"Raul Machi","28","Canada","Masculino", listOf(""))
    println("${machi.name}")
    println("${machi.age}\n ${machi.country}")


    val jorge = Taquero2("jorge")
    val juan = Taquero1("Juan")
    val taqueriaLosPanchos = Taqueria("cosas",juan)
    val taqueriaLosPrimos = Taqueria("cosas",jorge)
}