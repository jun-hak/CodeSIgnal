fun solution(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0
    for (j in matrix[0].indices) {
        for(i in matrix.indices) {
            val value = matrix[i][j]
            if(value != 0) {
                sum += value
            } else {
                break
            }
        }
    }
    return sum
}


/* Most Votes
    fun solution(m: List<List<Int>>) =
        m[0].indices.map{c -> m.indices.map{m[it][c]}.takeWhile{it > 0}.sum()}.sum()

*/