/******************************************************************************
 *  Purpose: Anagram detection
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/
import java.util.*

fun main() {
    println("Enter String1 for comparison")
    var str1: String? = readLine()
    println("Enter String2 for comparison")
    var str2: String? = readLine()

    var isAnagram = Arrays.equals(
        str1?.chars()?.sorted()?.toArray(),
        str2?.chars()?.sorted()?.toArray()
    );

    if (isAnagram)
        println("Strings are an anagrams of each other");
    else
        println("Strings are not Anagrams of each other");
}