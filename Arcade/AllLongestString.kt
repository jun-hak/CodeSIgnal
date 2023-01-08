fun solution(inputArray: MutableList<String>): MutableList<String> {
    val maxLength = inputArray.maxByOrNull { it.length }?.length ?: 0
    val answer = inputArray.filter { it.length == maxLength }.toMutableList()
    
    return answer
}




/* Most Vote는 아닌데, Most Votes보다 나아 보이는 답안지라!!
    fun solution(inputArray: MutableList<String>) =
            inputArray.groupBy { it.length }
                    .maxBy { it.key }?.value ?: emptyList()
*/