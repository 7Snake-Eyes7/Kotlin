/******************************************************************************
 *  Purpose: Insertion Sort of an array of integers
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(args: Array<String>) { // TODO Auto-generated method stub
    val a = intArrayOf(12, 11, 13, 5, 6)
    val x = InsertionSort()
    x.insertionSort(a)
}

class InsertionSort {
    fun insertionSort(a: IntArray) {
        var j: Int
        var i: Int = 1
        while (i < a.size) {
            var temp: Int = a[i]
            j = i
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1]
                j -= 1
            }
            a[j] = temp
            i++
        }
        i = 0
        while (i < a.size) {
            println(a[i].toString() + " ")
            i++
        }
    }
}