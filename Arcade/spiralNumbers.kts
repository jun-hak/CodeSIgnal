// Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

fun solution(n: Int): MutableList<MutableList<Int>> {
    val result = MutableList(n) { MutableList(n) { 0 } }
    var value = 1
    var top = 0
    var bottom = n - 1
    var left = 0
    var right = n - 1
    
    while (value <= n * n) {
        for (i in left..right) result[top][i] = value++
        top++
        for (i in top..bottom) result[i][right] = value++
        right--
        for (i in right downTo left) result[bottom][i] = value++
        bottom--
        for (i in bottom downTo top) result[i][left] = value++
        left++
    }
    return result
}