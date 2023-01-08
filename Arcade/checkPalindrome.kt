fun solution(inputString: String): Boolean {
    val n = inputString.length
    for (i in 0 until n / 2) {
        if (inputString[i] != inputString[n - i - 1]) {
            return false
        }
    }
    return true
}
