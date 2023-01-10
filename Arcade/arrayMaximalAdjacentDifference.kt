fun solution(inputArray: MutableList<Int>): Int {
    var max = Int.MIN_VALUE
  for(i in 1..(inputArray.size - 1)) {
       max = Math.max(max, Math.abs(inputArray[i] - inputArray[i - 1]))
  }
  return max
}



/*
fun solution(inputArray: MutableList<Int>): Int = inputArray.zipWithNext { a, b -> kotlin.math.abs(a-b) }.max()!!
*/