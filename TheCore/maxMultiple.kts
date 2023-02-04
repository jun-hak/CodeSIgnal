fun solution(n: Int, m: Int): Int {
    if(n > m)
        return 0

    return m - m % n
}
