// You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.

// Assuming that your hunch is correct, decode the message.



fun solution(code: String): String {
    val byte = 8
    if(code.length % byte != 0)
        return ""

    var i = 0
    var str = ""
    while(i * byte != code.length) {
        val strBinary = code.substring(i * byte until (i+1) * byte)
        i++

        str += strBinary.toInt(2).toChar()
    }

    return str
}

/*
fun solution(code: String): String = String(BigInteger(code, 2).toByteArray())
*/