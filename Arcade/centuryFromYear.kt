fun solution(year: Int): Int {
    return if (year % 100 == 0) {
        year / 100
    } else {
        year / 100 + 1
    }
}


/* Most votes
    fun solution(year: Int): Int =
        (year - 1) / 100 + 1
*/