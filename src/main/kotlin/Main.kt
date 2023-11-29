import kotlin.system.exitProcess

fun main() {

    println("\t"+ lastWord("Hello World"))
    println("\t"+ lastWord("   fly me   to   the moon    "))
    println("\t"+ lastWord("luffy is still joyboy"))
}

fun lastWord(string: String) : Int {

    var lengthString = string.length -1
    var lengthLastWord = 0

    for (i in 0..lengthString ){
        if (string[lengthString] == ' '){
            lengthString --
            if (string[lengthString] != ' '){
                while (string[lengthString] != ' '){
                    lengthLastWord++
                    lengthString --
                }
                break
            }
        }else{
            while (string[lengthString] != ' '){
                lengthLastWord++
                lengthString --
            }
            break
        }
    }
    return lengthLastWord

}