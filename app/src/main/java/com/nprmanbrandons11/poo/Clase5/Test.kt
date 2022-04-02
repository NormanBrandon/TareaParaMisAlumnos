package com.nprmanbrandons11.poo.Clase5

fun main(){
    val res = execute(2,Operation.Add(3))
    println("$res")
    val exp = eval(Expr.Sum(Expr.Const(2),Expr.Const(3)))
    println(exp)
    val json = JsonResponse.Codes(Code.SUCCESS)
    val ev = evalJson(json)
    println("$ev")
    val co = Code.SUCCESS
    println("${co.num}")
    val obj = JsonResponse.Codes(Code.ERROR)
}

fun evalJson(jsonResponse:JsonResponse)= when(jsonResponse){
    is JsonResponse.Codes -> when(jsonResponse.c){
        Code.SUCCESS -> jsonResponse.c.str
        Code.ERROR -> jsonResponse.c.str
        Code.FORGIVEN -> jsonResponse.c.str
        Code.NOT_FOUND -> jsonResponse.c.str
    }
    JsonResponse.Message -> "Mensajito"
}
fun execute(x: Int, op: Operation) = when (op) {
    is Operation.Add -> x + op.value
    is Operation.Substract -> x - op.value
    is Operation.Multiply -> x * op.value
    is Operation.Divide -> x / op.value
}
fun eval(e: Expr): Int =
    when (e) {
        is Expr.Const -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
        Expr.NotANumber -> java.lang.Double.NaN.toInt()
    }