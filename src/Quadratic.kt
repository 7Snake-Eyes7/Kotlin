package functional_programs

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Enter value for a :")
    var a = readLine()!!.toDouble()
    println("Enter value for b :")
    var b = readLine()!!.toDouble()
    println("Enter value for c :")
    var c = readLine()!!.toDouble()

    var delta = b.pow(2) - 4* a * c
    var root1 = (-b + sqrt(delta)) /(2*a)
    var root2 = (-b - sqrt(delta))/(2*a)
    println("the two roots are :")
    println("root1 is $root1")
    println("root1 is $root2")

}


