fun solution(n: Int): Int {
    return if(n > 1) {
        n * n + (n-1) * (n-1)
    } else {
        n
    }
}
