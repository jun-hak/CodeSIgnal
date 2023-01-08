fun solution(inputArray: MutableList<Int>): Int {
    var maxProduct = Int.MIN_VALUE
    for (index in 1 until inputArray.size) {
        val product = inputArray[index] * inputArray[index - 1]
        if(product > maxProduct) {
            maxProduct = product
        }
    }
    
    return maxProduct
}



/* Most votes
    fun solution(a: List<Int>) = a.zipWithNext(Int::times).max()!!
*/