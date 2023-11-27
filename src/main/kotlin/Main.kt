import kotlin.system.exitProcess

fun main() {

    println("\t"+ lastWord("Hello World"))
    println("\t"+ lastWord("   fly me   to   the moon "))
    println("\t"+ lastWord("luffy is still joyboy"))
}

fun lastWord(string: String) : Int {

    val newString = string.reversed()
    var i = 0
    if (newString[0] == ' ') {
        while (newString[i + 1] != ' ') {
            i++
        }
        for (a in i downTo 1) {
            print(newString[a])
        }
    } else {
        while (newString[i] != ' ') {
            i++
        }
        for (a in i downTo 0) {
            print(newString[a])
        }
    }
    return i
}