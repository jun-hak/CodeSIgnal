fun solution(a: MutableList<Int>): Int {
    var result = 0
    for (i in a.indices) {
        result = result or (a[i] shl 8 * i)
    }
    return result
}
