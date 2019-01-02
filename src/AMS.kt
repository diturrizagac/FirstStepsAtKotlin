import java.util.*

fun main(args:Array<String>){
    println("Hello world!")
    feedTheFish()
}

fun feedTheFish(){
    //val day = "Tuesday"
    val day = randomDay()
    //val food = "pellets"
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String{
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day:String):String{
    //var food = "fasting"
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
//    when(day){
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "flakes"
//        "Wednesday" -> food = "flakes"
//        "Thursday" -> food = "flakes"
//        "Friday" -> food = "flakes"
//        "Saturday" -> food = "flakes"
//        "Sunday" -> food = "flakes"
//    }
//    return food
}