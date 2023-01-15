// Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

// The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:


fun solution(bishop: String, pawn: String): Boolean
= bishop.map { it.toInt() }.sum() == pawn.map { it.toInt() }.sum() || (pawn[0]-bishop[0] == pawn[1] - bishop[1])

