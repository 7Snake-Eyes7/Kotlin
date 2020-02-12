package functional_programs

fun main(a : Array<String>) {
    var date = a[0].toInt()     //command line arguments
    var month = a[1].toInt()     //command line arguments
    var year = a[2].toInt()  //command line arguments
    println("The entered value is $date date $month month $year year")
    var year2: Int
    var month2: Int
    var date2: Int
    var day: Int
    year2 = year - (14 - month) / 12
    day = year2 + year2 / 4 - year2 / 100 + year2 / 400
    month2 = month + 12 * ((14 - month) / 12) - 2
    date2 = (date + day + 31 * month2 / 12) % 7
   var output =  when (date2){
        0-> "sunday"
        1-> "monday"
        2-> "tuesday"
        3-> "wednesday"
        4-> "thursday"
        5-> "friday"
        6-> "saturday"
        else-> "enter the valid day"

    }

    println(output)

}


