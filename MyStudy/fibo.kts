val s = mutableListOf<Int>(0, 1)
fun fib(n: Int): Int {
    return if (s.size <= n) {
        (fib(n - 1) + fib(n - 2)).also { s.add(it) }
    } else {
        s[n]
    }
}