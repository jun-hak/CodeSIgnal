
fun main(args: Array<String>) {
    val new = mutableListOf<Int>()
    combination(0, new, 5)
    println(result)
}

val result = mutableListOf<MutableList<Int>>()
val source = mutableListOf(1, 2, 3)
fun combination(prevIdx: Int, list: MutableList<Int>, target: Int) {
    if (target == 0) {
        result.add(list.toMutableList())
    } else if (target < 0) {
        return
    }

    for (i in prevIdx..source.lastIndex) {
        val num = source[i]
        list.add(num)
        combination(i, list, target - num)
        list.removeLast()
    }
}