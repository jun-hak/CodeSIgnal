fun solution(score1: Int, score2: Int): Boolean {
    val min = Math.min(score1, score2)
    val max = Math.max(score1, score2)
    
    return if (max == 6 && min < 5) {
        true
    } else if (max == 7 && min in 5..6) {
        true
    } else 
        false
}