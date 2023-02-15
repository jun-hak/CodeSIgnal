// [[1,3,1,2],
// [2,4,5,2],
// [3,4,5,6],
// [1,5,6,2]]
// Minimum path sum
// 마지막 2를 구하기 위해선 F(x,y) = cost(x,y) + Min(F(x-1,y),F(x,y-1))

val test = mutableListOf(
    mutableListOf(1, 3, 1, 2),
    mutableListOf(2, 4, 5, 2),
    mutableListOf(3, 4, 5, 6),
    mutableListOf(1, 5, 6, 2)
)
val tempList = MutableList(4) { 0 }
for (yIndex in 0 until test.size) {
    for (xIndex in 0 until test[yIndex].size) {
        val preXIndex = xIndex - 1
        val preYIndex = yIndex - 1
        val upCost = if (preYIndex >= 0) tempList[xIndex] else Int.MAX_VALUE
        val leftCost = if (preXIndex >= 0) tempList[preXIndex] else Int.MAX_VALUE

        if (upCost != Int.MAX_VALUE || leftCost != Int.MAX_VALUE)
            tempList[xIndex] = min(upCost, leftCost) + test[yIndex][xIndex]
        else
            tempList[xIndex] = test[yIndex][xIndex]
    }
    print(tempList)
}