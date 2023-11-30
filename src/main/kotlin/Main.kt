
fun main() {
    println( reserveNumbers(123))
    println( reserveNumbers(-123))
    println( reserveNumbers(120))
    println(reserveNumbers(2147483647))
    println(reserveNumbers(-2147483647))
    println(reserveNumbers(-2147483648))
    println(reserveNumbers(-999))
    println(reserveNumbers(99))
    println(reserveNumbers(-1000000000))
}

fun reserveNumbers(x: Int): Int {
    val maxValue = "2147483647"
    val minValue = "-2147483648"
    var newX = x
    var reservedNumber: Int = 0

    if (newX<0){
        newX *=-1
        if (x< -1_000_000_000){
            val stringX = newX.toString()
            if (stringX < minValue)
                return 0
        }
        else{
            val stringX = newX.toString()
            (stringX.reversed().toInt() * -1).also { reservedNumber = it }
        }
    }else{
        val stringX = x.toString()
        if (x>1000000000){
            if (stringX > minValue)
                return 0
        }else{
            reservedNumber = stringX.reversed().toInt()
        }
    }
    return reservedNumber
}


