// Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

fun solution(inputString: String) = String(inputString.map { if(it == 'z') 'a' else (it + 1)}.toCharArray())




/*
fun solution(inputString: String)= inputString.fold(""){ 
    str, c -> str + if(c == 'z') 'a' else c.inc() 
}
*/