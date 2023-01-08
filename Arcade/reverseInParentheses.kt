fun solution(inputString: String): String {
    var s = 0
    var e = 0
    for (i in inputString.indices) {
        if (inputString[i] == '(') {
            s = i
        }
        if (inputString[i] == ')') {
            e = i
            return solution(
                    inputString.substring(0, s) +
                            inputString.substring(s + 1, e).reversed() +
                            inputString.substring(e + 1))
        }
    }
    return inputString
}


/*
fun solution(i: String): String {

    var result = i
    while(result.contains("(")){
        result = result.replace(Regex("\\([^\\(\\)]*\\)")){
            it.value.drop(1).dropLast(1).reversed()
        }
    }

    return result
}
*/