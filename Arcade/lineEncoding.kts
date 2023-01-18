// Given a string, return its encoding defined as follows:

// First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
// for example, "aabbbc" is divided into ["aa", "bbb", "c"]
// Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
// for example, substring "bbb" is replaced by "3b"
// Finally, all the new strings are concatenated together in the same order and a new string is returned.

fun solution(s: String): String {
    val list = mutableListOf<MutableList<Char>>()
    for(c in s) {
        if(list.isNotEmpty()) {
            if(list.last()[0] == c) {
                list.last().add(c)
            } else {
                list.add(mutableListOf(c))
            }
        } else {
            list.add(mutableListOf(c))
        }
    }
    return list.map {
        val pre = if (it.size == 1) "" else "${it.size}"
        "$pre${it[0]}"
        }.reduce { acc, s ->
            acc + s
        }
}



/*
fun solution(s: String): String = s.replace("(.)\\1+".toRegex()) { result -> "${result.value.length}${result.value[0]}" }

 */