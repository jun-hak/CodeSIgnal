// Find the leftmost digit that occurs in a given string.

fun solution(inputString: String): Char = inputString.find { it.isDigit() }!!

