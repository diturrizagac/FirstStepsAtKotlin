package Sean

fun main(args:Array<String>){
    println("Hello wordl!")
    val isUnit = println("This is an expression")
    println(isUnit)
    val temperature = 60
    val isHot= if(temperature>50) true else false
    println(isHot)
    val message = "You are ${if (temperature>50) "fried" else "safe"} fish"
    println(message)


}
