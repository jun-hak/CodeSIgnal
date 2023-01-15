// Given array of integers, find the maximal possible sum of some of its k consecutive elements.


fun solution(inputArray: MutableList<Int>, k: Int): Int {
    var max = inputArray.slice(0..(k-1).coerceAtMost(inputArray.lastIndex)).sum()
    var next = max
    for (i in 1..inputArray.lastIndex) {
        next = next - inputArray[i - 1] + if(i-1+k >inputArray.lastIndex) 0 else  inputArray[i - 1 + k]
        if(next > max)
            max = next
    }
    return max
}

// 아래와 같이 했었다가, 실패함 아마도, 10만개 요소들을 들고 있는 리스트에서 6만개를 계속 가져와야 하는게 성능상 부담이 있어서 그런 것 같아서 위처럼 수정함.

// List(inputArray.size) { index ->
//     inputArray.slice(index..(index + k).coerceAtMost(inputArray.lastIndex)).sum()
// }.max()

//