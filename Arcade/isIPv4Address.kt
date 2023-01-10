fun solution(inputString: String): Boolean {
   val p = inputString.split(".")
   
   if(p.size != 4)
    return false
    
    for(e in p) {
        val c = e.toIntOrNull()
        if(c == null)
            return false
            
        if (c < 0 || c > 255)
            return false
            
        if (e == "00" || e == "01")
        return false
    }
    
    return true
}



/*
    fun solution(inputString: String): Boolean {
    val tokens = inputString.split(".")
    return tokens.size == 4 && tokens.all { it.toIntOrNull() in 0..255 }
    }
*/