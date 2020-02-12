import kotlin.math.sqrt

fun main(){
    println("Enter any number: ")
    var num = readLine()!!.toInt()
    var prime = Prime()
    num =prime.primeNum(num)
        if(num > 2)
            println(num)
}

class Prime {
    fun primeNum(num : Int) : Int{
        var num = num
        while (num % 2 == 0) {
            println(2)
            num /= 2
        }
        var i: Int
        for (i in 0..num) {
            while (num % 2 == 0) {
                println(i)
                num /= i
            }
        }
        return num
    }
}