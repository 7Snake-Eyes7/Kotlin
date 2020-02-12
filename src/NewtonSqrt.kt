package functional_programs

import kotlin.math.abs


fun main(){
    println("enter a number: ")
    var c = readLine()!!.toDouble()
    var t = c
    var epsilon = 1e-15
    while(abs(t- c/t) > epsilon*t){
        t = (c/t +t) /2
        println(t)
    }
}
