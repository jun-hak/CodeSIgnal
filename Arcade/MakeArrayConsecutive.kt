fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    var count = 0
    for (i in 1 until statues.size) {
        count += statues[i] - statues[i - 1] - 1
    }
    return count
}

/* Most votes
    fun solution(statues: MutableList<Int>): Int {
        return statues.max()!! - statues.min()!! - statues.size + 1;
    }
*/