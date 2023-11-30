fun main() {
    println(reversedNumber(123))
    println(reversedNumber(-123))
    println( reversedNumber(120))
    println(reversedNumber(2147483647))
    println(reversedNumber(-2147483648))
    println(reversedNumber(-2117483600))
    println(reversedNumber(2147483600))

}

//Solution1
fun reversedNumber(x: Int): Int {
    var newX = x
    var reversedNumber: Int = 0

    if (newX < 0) {
        newX *= -1
        try {
            reversedNumber = newX.toString().reversed().toInt() * -1
        } catch (e: NumberFormatException) {
            println("The Reversed Number is bigger than Int Type")
        }
    } else {
        try {
            reversedNumber = x.toString().reversed().toInt()
        } catch (e: NumberFormatException) {
            println("The Reversed Number is bigger than Int Type")
        }
    }
    return reversedNumber
}


