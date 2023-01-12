// Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
//
// Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.


// firstNumber을 index로 변환해서 생각해 보면 편하먀

fun solution(n: Int, firstNumber: Int): Int {
    val t = n / 2
    return if(firstNumber >= t) {
        firstNumber - t
    } else {
        firstNumber + t
    }
}

/* 그르넹..
    fun solution(n: Int, firstNumber: Int): Int = (firstNumber + n/2)%n
*/