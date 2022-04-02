package com.nprmanbrandons11.poo.Clase5

enum class Code(val str: String,val num:Int) {
    SUCCESS(str = "202",202),
    ERROR("401",401),
    FORGIVEN("500",500),
    NOT_FOUND("404",404);
}