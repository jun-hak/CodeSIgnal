

val a = mutableListOf<Int>(0,1,2,3,4,5,6)
val n = a.size
val k = 3

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    combi(-1, list)
    
    // 또 다른 중첩 for문을 이용한 combination
    for(i in 0 until n) {
        for (j in i+1 until n) {
            for (k in j+1  until n)
                println("i: $i j: $j k: $k")
        }
    }
}

fun combi(start: Int, b: MutableList<Int>) {
    if(b.size == k) {
        println("b size is equal k - $b");
        return;
    }

    for (i in (start+1) until n) {
        b.add(i)
        combi(i, b)
        b.removeLast()
    }
}