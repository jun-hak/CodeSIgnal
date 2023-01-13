// Given array of integers, find the maximal possible sum of some of its k consecutive elements.



fun solution(inputArray: MutableList<Int>, k: Int): Int = List(inputArray.size) { index -> inputArray.slice(index..(index + k).coerceAtMost(inputArray.lastIndex)).sum() }.max()