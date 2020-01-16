/******************************************************************************
 *  Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *
 *  @author: Rakshak
 *  @version:1.0
 *  @since:16-01-2020
 *
 ******************************************************************************/

fun main(){
    var greet:String = "Hello <<UserName>>, How are you?"
    var name = readLine()?:"rak"
    val old = "<<UserName>>"
    if (name.length>3) {
        val greetUser = greet.replace(old, name, true)
        println(greetUser)
    }
    else
        println("name must be >3 chars")
}