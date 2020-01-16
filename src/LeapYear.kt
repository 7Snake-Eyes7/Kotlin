/******************************************************************************
 *  Purpose: To find out, If the given year is a leap year or not
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main() {
    println("Enter the year to find out it's leap year or not ::")
    val x = readLine()!!.toInt()
    if(x%4==0)
        if(x%100==0)
            if(x%400==0)
                println("$x is a leap year")
            else
                println("$x is not a leap year")
        else
            println("$x is a leap year")
    else
        println("$x is not a leap year")
}