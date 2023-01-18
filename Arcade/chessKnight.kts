// Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

// The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.


fun solution(cell: String): Int {
    val bLeft = 'a'.toInt()
    val bRight = 'h'.toInt()
    val bBottom = '1'.toInt()
    val bTop = '8'.toInt()
    
    val curX = cell[0].toChar().toInt()
    val curY = cell[1].toChar().toInt()
    var cnt = 0
    for (x in -2..2) {
        for (y in -2..2) {
            val available = Math.abs(x * y)
            if(available == 2) {
                val newX = curX + x
                val newY = curY + y
                if((newX in bLeft..bRight) && (newY in bBottom..bTop)) {
                    cnt++
                }
            }
        }
    }
    return cnt
}

/*
fun solution(cell: String): Int =
        //Take a single move and reflect it over each axis of symmetry
        sequenceOf(1 to 2)
                .flatMap { (a, b) -> sequenceOf(a to b, b to a) } // x = y
                .flatMap { (a, b) -> sequenceOf(a to b, -a to -b) } // rotate 180 degrees
                .flatMap { (a, b) -> sequenceOf(a to b, -a to b) } // x = 0
                //Apply each of these moves
                .map { (x, y) -> cell[0] + x to cell[1] + y }
                //Check that they are on the board
                .filter { (x, y) -> x in 'a'..'h' && y in '1'..'8' }
                .count()

 */