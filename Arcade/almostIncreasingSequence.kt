fun solution(sequence: MutableList<Int>): Boolean {
    var count = 0
    for (i in 1 until sequence.size) {
        if (sequence[i] <= sequence[i - 1]) {
            count++
            if (count > 1) return false
            if (i == 1 || i == sequence.size - 1) continue
            if (sequence[i] > sequence[i - 2]) sequence[i - 1] = sequence[i - 2]
            else if (sequence[i - 1] >= sequence[i + 1]) return false
        }
    }
    return true
}



/* Most votes
    fun solution(sequence: MutableList<Int>): Boolean =
        (1 until sequence.size).count { i -> sequence[i-1] >= sequence[i] } <= 1 && 
        (2 until sequence.size).count { i -> sequence[i-2] >= sequence[i] } <= 1
*/