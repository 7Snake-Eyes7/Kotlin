/******************************************************************************
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(){
    println("Enter the number of times you want to flip the coin")
    var count = readLine()!!.toInt()
    var f=Flip()
    f.flipCoin(count)
}
class Flip {
    fun flipCoin(count: Int) {
        var count = count
        val x= count.toDouble()
        var chances = 0
        var heads: Int = 0
        var tails: Int = 0
        while(count--!=0) {
            val toss = Math.random()
            if (toss < 0.5) {
                tails++
                chances++
            }
            else {
                heads++
                chances++
            }
        }
        val headPercentage = (heads/x)*100
        val tailPercentage = 100-headPercentage
        println("Total Number of times the coin was flipped ::$chances")
        println("Number of times head was flipped :: $heads")
        println("Number of times tails was flipped :: $tails")
        println("percentage of heads is :: $headPercentage")
        println("percentage of tails is :: $tailPercentage")


    }
}