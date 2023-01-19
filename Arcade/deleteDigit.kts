// Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.


fun solution(n: Int): Int {
    val str = n.toString()
    return (str.indices).map {
        val list = str.toMutableList().apply { removeAt(it) }
        list.joinToString("").toInt()
    }.max()
}

public fun <T : Comparable<T>> Iterable<T>.max(): T {
    val iterator = iterator()
    if (!iterator.hasNext()) throw NoSuchElementException()
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}