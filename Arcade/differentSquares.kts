// Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

fun solution(matrix: MutableList<MutableList<Int>>): Int {
    if(matrix.size < 2)
        return 0

    if(matrix[0].size < 2)
        return 0

    val list = mutableListOf<String>()
    for(i in 1..matrix.lastIndex) {
        for(j in 1..matrix[0].lastIndex) {
            list.add(matrix[i-1][j-1].toString() + matrix[i][j-1].toString() + matrix[i-1][j].toString() + matrix[i][j].toString())
        }
    }

    return list.toSet().size
}


/* zipWithNext 공부가 필요하다!!
fun solution(matrix: MutableList<MutableList<Int>>): Int {
    return matrix.map { it.zipWithNext() }
            .zipWithNext().map { it.first.zip(it.second) }.flatten().distinct().count()
}
 */