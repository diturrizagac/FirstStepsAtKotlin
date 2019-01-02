import java.util.*

fun main(args:Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is today?")
    val day = numberOfDay()
    println(when(day){
        1 -> "Today is Sunday"
        2 -> "Today is Monday"
        3 -> "Today is Tuesday"
        4 -> "Today is Wednesday"
        5 -> "Today is Thursday"
        6 -> "Today is Friday"
        7 -> "Today is Saturday"
        else -> "Time has stopped"
    })


//    when(day){
//        1 -> println("Today is Sunday")
//        2 -> println("Today is Monday")
//        3 -> println("Today is Tuesday")
//        4 -> println("Today is Wednesday")
//        5 -> println("Today is Thursday")
//        6 -> println("Today is Friday")
//        7 -> println("Today is Saturday")
//        else -> println("Time has stopped")
//    }

}

fun numberOfDay() : Int{
    return Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
}