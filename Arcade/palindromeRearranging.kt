//Given a string, find out if its characters can be rearranged to form a palindrome.

//Example

//For inputString = "aabb", the output should be
//solution(inputString) = true.

//We can rearrange "aabb" to make "abba", which is a palindrome.


fun solution(inputString: String): Boolean {
    val size = inputString.length
    val map = inputString.groupBy { it }
    if(size % 2 == 0) {
        return map.values.all { (it.size) % 2 == 0 }
    } else {
        var find = 0
        map.values.forEach {
            if((it.size % 2) != 0)
                find ++
        }

        return find == 1
    }
}


/* 짝수개 있는 건 신경 안써도 됐구나... 멍청
fun solution(inputString: String) = 
    inputString.toSet().filter { c -> inputString.count { it == c } % 2 == 1}.count() < 2
*/