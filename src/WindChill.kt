package functional_programs

import kotlin.math.pow

fun main(a : Array<String>) {
    var t = a[0].toDouble()

    var v = a[1].toDouble()
    if(t < 50 || ( v < 120 || v > 3)){
        var windchill = 35.74 +  0.6215 + (0.4275*t  - 35.75)* v.pow(0.16)
    println("The windchill is $windchill")
}
    else
        println("The value for temp and v are not valid")
}