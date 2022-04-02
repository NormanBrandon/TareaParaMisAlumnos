package com.nprmanbrandons11.poo.Clase5

sealed class Expr{
    class Const(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
    object NotANumber : Expr()
}