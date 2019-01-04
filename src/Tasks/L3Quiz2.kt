package Tasks

fun main(args:Array<String>){
    val currentTime = 5
    showGreeting(currentTime)
}

fun showGreeting(currentTime :Int){
    if (currentTime<12) println("GoodMorning")
    else if (currentTime<18) println("GoodAfternoon")
    else println("GoodNight")
}