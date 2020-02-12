package functional_programs

fun main(){
    var temp = Temperature()
    println("1. Celsius to Fahrenheit 2.Fahrenheit to Celsius")
    var choice = readLine()!!.toInt()

    temp.conversion(choice)

  }


class Temperature{
    fun conversion(choice : Int){
        var temp1 : Int =0
        var temp2 : Int =0
        var far : Int =0
        var cel : Int =0
        if(choice ==1) {
            println ( "Enter a temperature below 100degree")
            temp1 = readLine()!!.toInt()
            far =   (temp1 * 9/5) + 32
            println("The fahrenheit temp is $far")

        }
        else if (choice== 2) {
            println("Enter a temperature about 32degree")
            temp2 = readLine()!!.toInt()
            cel =  (temp2 - 32) * 5/9
            println("The celcius temp is $cel")

        }
        else{
            println("temperature is not valid")
        }

    }
}
