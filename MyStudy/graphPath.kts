import java.lang.Integer.min

fun main(args: Array<String>) {
    val new = mutableListOf(
        mutableListOf(0, 1, 0, 0, 0),
        mutableListOf(0, 1, 1, 1, 0),
        mutableListOf(0, 0, 0, 0, 0),
        mutableListOf(1, 0, 0, 1, 0),
        mutableListOf(0, 0, 1, 1, 0),
    )

    val path = ShortestPath()
    println(path.solution(new))
//    println(Coordinate(0, 0).getAround())
}

class ShortestPath {

    fun setSize(matrix: MutableList<MutableList<Int>>) {
        rows = matrix.size
        cols = matrix[0].size
    }

    fun solution(matrix: MutableList<MutableList<Int>>): Int {
        if (matrix.size > 0 && matrix[0].size > 0) {
            setSize(matrix)
        } else {
            return -1
        }

        if (matrix[0][0] == 1)
            return -1


        val queue = ArrayDeque<Coordinate>().apply { add(Coordinate(0, 0)) }
        val countQ = ArrayDeque<Int>().apply { add(1) }
        val visited = mutableSetOf(Coordinate(0, 0))
        while (queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            val count = countQ.removeFirst()
            matrix[cur.y][cur.x] = count

            if (cur.y == rows - 1 && cur.x == cols - 1)
                return count

            val test = cur.getAround()
            val findList = test.filter {
                if (it.x < 0 || it.y < 0 || it.y >= rows || it.x >= cols) {
                    false
                } else if (matrix[it.y][it.x] == 0) {
                    true
                } else {
                    false
                }
            }

            for (find in findList) {
                if (!visited.contains(find)) {
                    queue.add(find)
                    countQ.add(count + 1)
                    visited.add(find)
                }
            }
        }

        return -1
    }

    var rows = -1
    var cols = -1

    data class Coordinate(val x: Int, val y: Int)

    private fun Coordinate.getAround() =
        (-1..1)
            .flatMap { xIdx ->
                (-1..1)
                    .map { yIdx -> Coordinate(this.x - xIdx, this.y - yIdx) }
            }
            .toMutableList()
            .apply { remove(this@getAround) }
}

