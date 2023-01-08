fun solution(a: MutableList<Int>): MutableList<Int> {
    val t = mutableListOf<Int>()
    val p = mutableListOf<Int>()
    for (i in a.indices) {
        if (a[i] == -1) {
            t.add(i)
        } else {
            p.add(a[i])
        }
    }
    p.sort()
    for (j in t) {
        p.add(j, -1)
    }
    return p
}



// tree랑 person 2개 리스트를 만들어서 넣는 방법이라면 
// 아래는 Person 위치 찾고 
/* Most Votes
    fun solution(a: MutableList<Int>): MutableList<Int> {
        val s = a.filter { it != -1 }.sorted().toMutableList()
        return a.map { if (it == -1) -1 else s.removeAt(0)}.toMutableList()
    }
*/