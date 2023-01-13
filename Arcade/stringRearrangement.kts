
fun solution(inputArray: MutableList<String>): Boolean {
    permute(inputArray)
    return test
}

fun compareString(s1: String, s2: String): Boolean {
    if (s1.length != s2.length || s1 == s2) return true
    var test = false
    for (i in s1.indices)
        if (s1[i] != s2[i])
            if (!test)
                test = true
            else
                return true
    return false
}

fun testArray(inputArray: MutableList<String>): Boolean {
    for (i in 1 until inputArray.size)
        if (compareString(inputArray[i], inputArray[i - 1])) return false
    return true
}

var test = false
fun permute(list: MutableList<String>, s: Int = 0) {
    if (s == list.size && testArray(list))
        test = true
    else
        for (i in s until list.size) {
            Collections.swap(list, i, s)
            permute(list, s + 1)
            Collections.swap(list, i, s)
        }
}