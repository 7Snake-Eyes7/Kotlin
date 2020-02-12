package functional_programs

import java.util.concurrent.CountDownLatch
import kotlin.system.measureTimeMillis

fun main(){

    val time1 = System.currentTimeMillis()
    println(time1)
    val time2 = System.currentTimeMillis()
    println(time2)
    var elapsed = time2 -time1
    println(elapsed)
}

fun start()
{
    var a = 10
    var b = 20
    var c = a + b
    println(c)


}