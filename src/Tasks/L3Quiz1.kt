package Tasks

import java.util.*

fun main(args:Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is today?")
    val day = numberOfDayLambda()
    //val day = 5
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
}

fun numberOfDay() : Int{
    return Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
}

fun numberOfDayLambda() :Int  = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)