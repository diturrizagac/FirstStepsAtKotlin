fun main(args:Array<String>){
    getFortune(getBirthday())
}

fun getFortune(birthday:Int) : String{
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday:")
    return fortunes[birthday.rem(fortunes.size)]
}

fun getBirthday():Int{
    return readLine()?.toIntOrNull() ?:1
}