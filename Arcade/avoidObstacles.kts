//You are given an array of integers representing coordinates of obstacles situated on a straight line.
//
//Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
//
//Find the minimal length of the jump enough to avoid all the obstacles.
// 최소한 연속한 갯수보다 1개는 커야 함.
// 나는 n의 배수만 갈 수 있음
// 그래서 모든 인자들이 내가 가려는 것으로 나누어 떨어지면 한개씩 증가 시키면 될듯
// 근데 이게 최대 효율일까..???? 우선 하고 답 보자

fun solution(inputArray: MutableList<Int>): Int {
    var interval = 0
    inputArray.sorted()
    for (i in 1..inputArray.size - 1) {
        if(inputArray[i] - inputArray[i - 1] == 1)
            interval++
    }
    // minimum interval
    interval++
    do {
        if(inputArray.filter { it % interval == 0 }.isEmpty())
            break;
        interval++
    } while (true)

    return interval
}


/* 그러네, 사실 찾을 필요가 굳이 없었네, Sort 비용, for로 한번 흝고 그다음 1씩 올리는 내 로직이랑, 1부터 찾는 아래쪽 로직이랑, 오히려 sort후 for때문에 2번 흝게되서 더 비효율적인가
    fun solution(inputArray: MutableList<Int>): Int = (1..Int.MAX_VALUE).first { jump -> inputArray.all { it % jump != 0 } }
*/