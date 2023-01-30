// Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

// This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

fun solution(grid: MutableList<MutableList<Int>>): Boolean {
    val check = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val length = grid.size
    var result = true

    grid.forEach { row ->
        var list = check.toMutableList()
        if (!row.all { list.remove(it) }) {
            return false
        }
    }
    
    grid[0].forEachIndexed { index, i ->
        var list = check.toMutableList()
        if (!(0..8).all {
                list.remove(grid[it][index])
            })
            return false
    }

    for(i in 0 until length step 3) {
        for(j in 0 until length step 3) {
            var list = check.toMutableList()
            if(!(i..i+2).all { x -> 
                (j..j+2).all { y -> 
                    list.remove(grid[x][y])
                }
            })
            return false
        }
    }
    
    return true
}

/*
fun solution(grid: MutableList<MutableList<Int>>): Boolean =
//All 9 in each row
grid.all { it.distinct().count() == 9 } &&
//All 9 in each column
grid.flatMap { it.withIndex() }.groupBy { it.index }.all { it.value.map { it.value }.distinct().count() == 9 } &&
//All 9 in each 3x3 square
grid.windowed(3, 3).all { it.flatMap { it.windowed(3, 3).withIndex() }.groupBy { it.index }.all { it.value.flatMap { it.value }.distinct().count() == 9 } }

 */