import java.lang.Math.pow

fun main(args: Array<String>) {
    var powerOfTwo = PowerOfTwo()
    val a = args[0].toInt()
        var num = a;
   powerOfTwo.powerOf(num)
    }

class PowerOfTwo{
    fun powerOf(number :Int){
        var num = number
        if( 0 <= num && num < 31){
            for (i in 0..num) {
                if (i == 0) {
//                println(num);
                } else {
                    num = (pow(2.0, i.toDouble())).toInt();
                    println(num);
                }
            }
        }
    }
}