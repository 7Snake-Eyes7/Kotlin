/******************************************************************************
 *  Purpose: To find out the factorial of a given Integer
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(){
    println("Enter an Integer to find out it's factorial")
    var x = readLine()!!.toInt()
    println(factorial(x))
}

fun factorial(x:Int):Int{
    return if (x==0)
        1
    else
        x*factorial(x-1)
}