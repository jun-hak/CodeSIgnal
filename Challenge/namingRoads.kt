fun solution(roads: MutableList<MutableList<Int>>): Boolean {
    val map = mutableMapOf<Int, MutableList<Int>>();
    for (road in roads) {
        val e1 = road[0]
        val e2 = road[1]
        val s = road[2]
        var contain = map[s - 1]?.any { it == e1 || it == e2 } ?: false
        if(contain) return false
        contain = map[s + 1]?.any { it == e1 || it == e2 } ?: false
        if(contain) return false
        if(map[s] == null)
            map[s] = mutableListOf<Int>()
        map[s]!!.add(e1)
        map[s]!!.add(e2)
    }
  return true
}



/*
fun solution(r: MutableList<MutableList<Int>>): Boolean {
    val a = r.sortedBy { it[2] }
    
    
    for(i in 0 until a.size-1){
        if(a[i+1].slice(0 until 2).contains(a[i][0]) ) return false
        else if (a[i+1].slice(0 until 2).contains(a[i][1]) ) return false
    }
    
    return true
    
} */