// Given two cells on the standard chess board, determine whether they have the same color or not.


fun solution(cell1: String, cell2: String): Boolean = (cell1[0].toInt() + cell1[1].toInt() + cell2[0].toInt() + cell2[1].toInt()) % 2 == 0

