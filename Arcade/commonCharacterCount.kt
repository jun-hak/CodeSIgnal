fun solution(s1: String, s2: String): Int {
    val alphabetSet = s1.toSet()
    var solution = 0
    for (i in alphabetSet) {
        val v1 = s1.count { it == i }
        val v2 = s2.count { it == i }
        solution += if (v1 > v2) v2 else v1
    }
    return solution
}


/* Most Votes
fun solution(a: String, b: String) =
    ('a'..'z').map{c -> Math.min(a.count{it == c}, b.count{it == c})}.sum()
*/