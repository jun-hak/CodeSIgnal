// Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

// Given an integer, find its digit degree.


fun solution(n: Int): Int {
    var i = 0
    var d = n
    while(d.toString().length > 1) {
        i++
        d = digitDegree(d)
    }
    return i
}

fun digitDegree(n: Int): Int {
    return n.toString().map { it.digitToInt() }.sum()
}
