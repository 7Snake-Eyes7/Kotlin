import java.util.Scanner

fun main(a : Array<String>){
    val reader = Scanner(System.`in`)
    val name : String = reader.nextLine();
    if(name.length> 2) {
        println("Hello $name, how are you?")
    }
    else
        println("Enter a valid name")
    }