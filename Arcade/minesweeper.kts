//In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.



fun solution(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    return (0 until matrix.size).map { x ->
        (0 until matrix[x].size).map { y ->
            matrix.slice((x - 1).coerceAtLeast(0)..(x + 1).coerceAtMost(matrix.lastIndex)).map { e ->
                e.slice( (y - 1).coerceAtLeast(0)..(y + 1).coerceAtMost(matrix[x].lastIndex))
            }.flatten().filter { it }.sumBy { if(it) 1 else 0 } + if(matrix[x][y]) -1 else 0
        }.toMutableList()
    }.toMutableList()
}

/*
fun solution(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> =
        (matrix.indices)
                .map { row -> matrix[0].indices
                        .map { col -> (-1..1)
                                .sumBy { x -> (-1..1)
                                        .sumBy { y -> if (!(x == y && x == 0) && matrix.getOrNull(row + x)?.getOrNull(col + y) == true) 1 else 0 } }
                        }.toMutableList()
                }.toMutableList()

*/