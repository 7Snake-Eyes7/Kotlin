/******************************************************************************
 *  Purpose: Binary Search of an array of Strings
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(args: Array<String>) {
    val arr = arrayOf("rak", "rama", "naanu", "c#")
    val x = "rak"
    val z = BinarySearchOfAString()
    val result: Int = z.binarySearch(arr, x)
    if (result == -1) println("String is not found") else println("String found at index ===>>> $result")

}

class BinarySearchOfAString {
    fun binarySearch(arr: Array<String>, x: String): Int {
        var l = 0
        var r = arr.size - 1
        while (l <= r) {
            val m = l + (r - l) / 2
            val res = x.compareTo(arr[m]!!)
            if (res == 0) return m
            if (res > 0) l = m + 1 else r = m - 1
        }
        return -1
    }
}