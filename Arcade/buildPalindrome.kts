// Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

fun solution(s: String): String {
    var i = 0
    var str = s
    while(str.toString()  != str.toString().reversed()) {
        str = str.take(str.length - i) + str[i] + str.takeLast(i)
        i++
    }
    return str
}