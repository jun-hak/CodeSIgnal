fun solution(n: Int, firstNumber: Int): Int {
    val s = n / 2

    return if(firstNumber >= s) firstNumber - s else s + firstNumber
}
