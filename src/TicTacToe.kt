package functional_programs

val X = 1
val O = -1
const val EMPTY = 0
internal var player = X
val board = Array(3) {IntArray(3)}

var isEmpty = false
fun main(){
    var x= 0
    var  y=0
        do{
            when(player){
                X -> ("player X turn")
                O -> println("player O turn")
            }
                println("enter the values for x and y")
                x = readLine()!!.toInt()
                y = readLine()!!.toInt()
        }while (isEmpty)
    putSign(x, y)

  println(toString())
//    println("__________________________________")
//    display()
}

    fun putSign(x: Int, y: Int) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            println("Invalid board position!")
            return
        }
        if (board[x][y] != EMPTY) {
            println("The place is occupied")
            return
        }

        board[x][y] = player
        player = -player
    }

     fun toString(): Array<CharArray> {
        isEmpty = false
        println("Inside string method:::")
         val s = Array(3) {CharArray(3)}
        for (i in 0 until 2) {
            for (j in 0 until 2) {
                when (board[i][j]) {
                    X-> s[i][j] = 'X'
                    //X -> s.plus("X")
                    O -> s[i][j] = 'O'
                    EMPTY -> {
                        s[i][j] = ' '
                        isEmpty = true
                    }
                }
                println(board[i][j])
                if (j < 2) {
                    s[i][j] = '|'
                }

            }
            if (i < 2) {
            }
        }
         println(s)
        return s
    }

    fun isWin(player: Int): Boolean {
        return board[0][0] + board[1][1] + board[2][2] == (player * 3) ||
                board[0][1] + board[1][1] + board[2][1] == (player * 3) ||
                board[0][2] + board[1][2] + board[2][2] == (player * 3) ||
                board[0][0] + board[1][0] + board[2][0] == (player * 3) ||
                board[0][0] + board[0][1] + board[0][2] == (player * 3) ||
                board[1][0] + board[1][1] + board[1][2] == (player * 3) ||
                board[2][0] + board[2][1] + board[2][2] == (player * 3) ||
                board[0][2] + board[1][1] + board[2][0] == (player * 3)
    }

    fun display() {

        if (isWin(X)) {
            println("X wins !")
            isEmpty = false
        } else if (isWin(O)) {
            println("O wins !!")
            isEmpty = false
        } else
            if (!isEmpty) {
                println("its a tie!")
            }
    }