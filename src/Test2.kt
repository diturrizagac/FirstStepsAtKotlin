fun main(args:Array<String>){
    val isUnit = println("this is an expresion")
    val temperature = 60
    val isHot= if(temperature>50) true else false
    println(isHot)
    val message = "You are ${if (temperature>50) "fried" else "safe"} fish"
    println(message)

}