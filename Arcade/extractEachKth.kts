// Given array of integers, remove each kth element from it.




fun solution(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
  return inputArray.filterIndexed { i, e -> (i + 1) % k != 0 }.toMutableList()
}
