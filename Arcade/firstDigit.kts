// Find the leftmost digit that occurs in a given string.

fun solution(inputString: String): String {
    var prefix = ""
    for (c in inputString.toList()) {
        if(c.isDigit()) {
            prefix += c
        } else {
            break
        }
    }
    return  prefix
}
