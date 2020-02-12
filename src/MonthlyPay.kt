package functional_programs

import java.lang.Math.pow
import kotlin.math.pow

fun main(arg: Array<String>){
    var loanAmount = arg[0].toDouble()
    var year = arg[1].toDouble()
    var rate = arg[2].toDouble()

    println("Entered value to calculate monthly payment is $loanAmount principal, $year years , $rate rate of interest")
    var monthlyPay : Double = calPayment(year, rate, loanAmount)
    var totalPayment=0
    var newAmount =0
    var month = 0
    println(monthlyPay)
    var costPayed : Double = 0.0
    while(costPayed <= loanAmount){
        costPayed += monthlyPay
        var interestAdded = loanAmount  + rate
        var newAmount = interestAdded - costPayed
        month++
        println("monthlyPay is $monthlyPay" )
    }
}


fun calPayment( year: Double ,  rate : Double ,loanAmount: Double ): Double {

    var term : Double= 12 * year
    var rateInmonth: Double = rate/(12 * 100)
    var payment = (loanAmount* rateInmonth) /(1-pow((1+rateInmonth), (-term)))
    return payment
}

