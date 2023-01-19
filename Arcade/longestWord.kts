// Define a word as a sequence of consecutive English letters. Find the longest word from the given string


fun solution(text: String): String {
    var list = mutableListOf<String>()
    var str = ""
    text.forEach {
        if(it.isLetter()) {
            str += it
            
        } else {
            if(str.isNotEmpty())
                list.add(str)
            str = ""
        }
    }
    
    if(str.isNotEmpty())
        list.add(str)

    list.sortBy { it.length }

    return if(list.isNotEmpty()) list.last() else ""
}


/*
fun solution(text: String): String = "[a-zA-Z]+".toRegex().findAll(text).map { it.value }.maxBy { it.length }!!
 */