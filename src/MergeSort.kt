/******************************************************************************
 *  Purpose: Binary Search of an array of Strings
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(arg: Array<String>) {
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()

    println("Enter elements : ")
    var a = Array(n) { 0 }
    for (i in 0 until n)
        a[i] = readLine()!!.toInt()

    mergeSort(a, 0, a.size - 1)

    println("Sorted array is : ")
    for (i in 0 until n)
        print("${a[i]}  ")
}

fun merge(A: Array<Int>, p: Int, q: Int, r: Int) {
    var left = A.copyOfRange(p, q + 1)
    var right = A.copyOfRange(q + 1, r + 1)
    var i = 0
    var j = 0

    for (k in p..r) {
        if ((i <= left.size - 1) && ((j >= right.size) || (left[i] <= right[j]))) {
            A[k] = left[i];
            i++;
        } else {
            A[k] = right[j];
            j++;
        }
    }
}

fun mergeSort(A: Array<Int>, p: Int, r: Int) {
    if (p < r) {
        var q = (p + r) / 2
        mergeSort(A, p, q)
        mergeSort(A, q + 1, r)
        merge(A, p, q, r)
    }
}
