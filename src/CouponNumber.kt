fun main() {

    var count = 0
    println("Enter the number of distinct no.s to check: ")
    var numOfCN = readLine()!!.toDouble()
    var random = arrayOf<Double>(numOfCN)
    for (i in 0 until numOfCN.toInt()) {
        random[i] = Math.random()*10
    }

    for(i in 0 until numOfCN.toInt()){
        println(random[i])
    }
    println("Number not found")
}