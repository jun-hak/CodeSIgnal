// Check if all digits of the given integer are even.


fun solution(n: Int) = n.toString().all { it.toInt() % 2 == 0 }

