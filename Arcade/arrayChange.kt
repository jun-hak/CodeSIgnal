fun solution(inputArray: MutableList<Int>): Int {
    var v = Int.MAX_VALUE
    var s = 0
    inputArray.mapIndexed{i, e ->
     if (i == 0) {
        v = e
    } else {
        if(v < e) {
            v = e 
        } else {
           v +=1
           s += (v - e)
        }
    }  }
    return s
}


/*
fun solution(inputArray: MutableList<Int>): Int {
    return inputArray.withIndex().drop(1)
            .map { it -> {
                if(inputArray[it.index - 1] < it.value)
                    0
                else {
                    inputArray[it.index] = inputArray[it.index-1] + 1
                    inputArray[it.index] - it.value
                }
            }.invoke()
            }
            .sum()

}
*/