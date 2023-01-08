fun solution(n: Int): Boolean {
    var s = 0
    var v = n
    val half = n.toString().length / 2
    var iter = 0
    while(v != 0) {
        iter++
        if(iter <= half)
            s += (v % 10)
        else
            s -= (v % 10)
        v /= 10
    }
  
  return s == 0
}


/*
    fun solution(n: Int): Boolean {
        val s = n.toString()
        val mid = s.length / 2
        
        return s.dropLast(mid).chars().sum() == s.drop(mid).chars().sum()
    }
*/