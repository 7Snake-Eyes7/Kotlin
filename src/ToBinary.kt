package functional_programs

import java.util.*
class Binary {
    fun tobinary(stack: Stack<Int>, number: Int): Array<Int?> {         //function to convert decimal to binary
        var rem: Int
        val a = arrayOfNulls<Int>(8)                               // array of integers of size 8 containing zeroes
        var num: Int = number
        var count = 0                                                   //to count the number of digits pushed
        while (num != 0) {
            rem = num!!.rem(2)                                   //calculation of remainder of a number
            println("rem is $rem")
            num /= 2                                                   //reassigning the number to its quotient
            stack.push(rem)
            count++
        }
        if (count < 8) {                                                // condition to append 0 as a digit to MSB
            var zero = 8 - count
            for (i in 0 until zero) {
                stack.push(0)                                       //pushes zero to represent a byte value
            }
        }

        println("-------------")
        for (i in 0 until 8) {
            var poppedElement = stack.pop()                                //removing the element pushed onto stack and assigning it to a variable
            print(poppedElement)
            a[i] = poppedElement                                            // placing the element removed into array a
        }
        return a                                                            //returning array of integers
    }

}
fun main(a : Array<String>){
    var bin= Binary()
    println("Enter any digit: ")
    var num = readLine()!!.toInt()
    var stack = Stack<Int>()
    bin.tobinary(stack , num)
}