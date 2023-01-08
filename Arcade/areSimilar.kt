fun solution(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    return a.sorted() == b.sorted() && a.zip(b).count { it.first != it.second } < 3
}
