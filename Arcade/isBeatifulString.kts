// A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.

// Given a string, check whether it is beautiful.

fun solution(inputString: String): Boolean {
    val test = inputString.map { it }.sorted().groupBy { it.toInt() - 'a'.toInt() }
if(test.keys.last() != test.size - 1)
    return false

for(i in 1 until test.size) {
    if(test.values.toList()[i-1].size - test.values.toList()[i].size < 0)
        return false
}
return true
}


/*
fun solution(inputString: String): Boolean {
    val charCounts = inputString.groupBy { it }.mapValues { (_, list) -> list.size }

    return ('a'..'z').zipWithNext().all { charCounts[it.first] ?: 0 >= charCounts[it.second] ?: 0 }
}
 */