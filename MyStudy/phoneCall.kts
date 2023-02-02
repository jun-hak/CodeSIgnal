fun solution(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    if(s < min1)
        return 0
    var s1 = s - min1
    if(s1 == 0)
        return 1

    for(i in 1 ..9) {
       if(s1 - min2_10 <= 0) {
           return i
       } else {
           s1 -= min2_10
       }
    }
    val s2 = s - min1 - 9 * min2_10
    return 1 + 9 + s2 / min11
}
