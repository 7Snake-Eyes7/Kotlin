/******************************************************************************
 *  Purpose: Fibonacci Series
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main() {
    println("Enter how many terms you want to find ::")
    val n = readLine()!!.toInt()
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")
    for (i in 1..n) {
        print("$t1   ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}