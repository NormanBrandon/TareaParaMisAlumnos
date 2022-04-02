package com.nprmanbrandons11.poo.Clase5

sealed class JsonResponse {
    object Message :JsonResponse()
    class Codes(val c:Code):JsonResponse()
}