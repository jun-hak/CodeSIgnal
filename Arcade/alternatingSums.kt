fun solution(a: MutableList<Int>): MutableList<Int> {
    val size = a.size - 1
  return mutableListOf(a.slice(0..size step 2).sum(), a.slice(1..size step 2).sum())
}
