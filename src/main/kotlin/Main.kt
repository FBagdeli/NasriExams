
fun main() {
    println( reserveNumbers(123))
    println( reserveNumbers(-123))
    println( reserveNumbers(120))
    println(reserveNumbers(2147483647))
    println(reserveNumbers(-2147483647))
}

fun reserveNumbers(x: Int): Int {
    val maxValue: Int = 2147483647
    val minValue: Int = -2147483647
    var newX = x
    val reservedNumber : Long

    if (newX<0){
        newX *= -1
        val stringX = newX.toString()
        reservedNumber = (stringX.reversed().toLong() * -1)

        return if (reservedNumber in (minValue + 1)..<maxValue) {
            reservedNumber.toInt()
        } else 0
    }else{
        val stringX = x.toString()
        reservedNumber = stringX.reversed().toLong()

        return if (reservedNumber in (minValue + 1)..<maxValue) {
            reservedNumber.toInt()
        } else 0

    }
}


