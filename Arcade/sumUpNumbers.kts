// CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

// Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

fun solution(inputString: String): Int {
    var list = mutableListOf<Int>()
    var str = ""
    inputString.forEach {
        if(it.isDigit()) {
            str += it
        } else {
            if(str.isNotEmpty())
                list.add(str.toInt())
            str = ""
        }
    }
    if(str.isNotEmpty())
        list.add(str.toInt())

    return if(list.size > 0) list.reduce {a, b -> a + b} else 0
}


/*
fun solution(inputString: String): Int = "\\d+".toRegex().findAll(inputString).map { it.value.toInt() }.sum()
 */
