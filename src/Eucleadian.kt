package functional_programs

import kotlin.math.pow
import kotlin.math.sqrt

fun main(a : Array<String>){
    var x = a[0].toDouble()
    var y = a[1].toDouble()

    var distance = sqrt(x.pow(2)+y.pow(2))

    println(distance )

}