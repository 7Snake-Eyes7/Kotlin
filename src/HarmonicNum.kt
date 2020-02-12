fun main() {
    println("Enter a number: ")
    var num = readLine()!!.toInt()

    var value : Double = 0.0
    if(num > 0) {
        for (i in  1..num) {
            var j = i.toDouble()
            value +=(1.0 / j)               //represents 1/1 + 1/2 + 1/3 ...till 1/num
        }
        println(value)
    }
    else
        println("The number should be greater than zero")
}