fun solution(n: Int): Int = ((n / 60).toString() + (n % 60).toString()).map { it.digitToInt() }.sum()