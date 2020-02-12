package functional_programs

fun main(){
    var game = Game()
    println("Enter the number of times he wants to play: ")
    var trials = readLine()!!.toInt()
    println("Enter the value for goal: ")
    var goal = readLine()!!.toInt()
    println("Enter the value for stake: ")
    var stake = readLine()!!.toInt()
    game.gamble(trials, goal, stake)
}

class Game{
    fun gamble(trials: Int, goal : Int, stake : Int){
        var stake = stake
        var bets : Int = 0
        while(stake > 0 && stake == goal ){        //valid to play till stake becomes 0 or reaches goal amount
            var number = Math.random()*30      //random number to calculate win or loss after every bet

            if(number < 0.5){                   //considers bet as a fail
                stake--
            }
            else                                   //considered as win
                bets++
        }
        if(stake == goal){
            println("He won")
        }
        else
            println("he lost")
    }
}