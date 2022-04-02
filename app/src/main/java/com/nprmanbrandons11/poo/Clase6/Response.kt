package com.nprmanbrandons11.poo.Clase6
//PARA RESPONSE DE APIS
//formato para retrofit -> libreria que nos permite consimir API's REST
// www.apifrase.com/api/abraham-lincon -> BASE URL
//Abraham Lincon ->

// Se puede transformar a un JSON

data class Response(
    val code:Int, //-> 200 success, 400 error, 500 forgiven, 100 info
    val message:String, // -> se encontraron frases
    val frases:List<String> // "frase 1", "frase 2", "frase3"
)