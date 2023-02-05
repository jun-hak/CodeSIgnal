fun solution(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if(maxW >= weight1 + weight2) {
       return value1 + value2
   } else if(maxW >= weight1 || maxW >= weight2) {
       if(value1 >= value2 && maxW >= weight1 || maxW < weight2)
           return value1
       else return value2
   } else {
       return 0
   }
}


// 단순히 if문 안하고 찾는 방법이 있을까
// 2개 합 비교
// 단일 비교
  

/*

fun solution(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    return when {
        weight1 + weight2 <= maxW -> return value1 + value2
        maxW >= Math.max(weight1, weight2) -> Math.max(value1, value2)
        maxW < Math.min(weight1, weight2) -> 0
        else -> if(weight2 < weight1) value2 else  value1 
    }
}
*/