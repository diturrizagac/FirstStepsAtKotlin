package Alex

import java.util.*

fun main(args:Array<String>){
    println("Hello world!")
    feedTheFish()
}

fun shouldChangeWater(
        day: String,
        temperature:Int =22,
        dirty:Int =20): Boolean{
    return true
}

fun shouldChangeWater2(
    temperature:Int =22,
    dirty:Int =20,
    day: String){
}

fun feedTheFish(){
    //val day = "Tuesday"
    val day = randomDay()
    //val food = "pellets"
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day,20,50)
    shouldChangeWater(day)
    shouldChangeWater(day,dirty = 50)
    shouldChangeWater2(day = "Monday")

    if(shouldChangeWater(day)){
        println("Change the water today")
    }
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
}