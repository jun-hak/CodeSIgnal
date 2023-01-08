fun solution(prices: MutableList<Double>, notes: MutableList<String>, x: Double): Boolean {
    var totalSensitivity:Double = .0
    for(index in notes.indices) {
        val parsedString = notes[index]
        val parsedPrice = prices[index]
        val parsedSensitivity = parsedString.substringBefore("%").trim().toDoubleOrNull()
        if(parsedString.contains("higher than in-store")) {
            if(parsedSensitivity != null) {
                val originalPrice = (parsedPrice * 100)/(100 + parsedSensitivity)
                totalSensitivity += (parsedPrice - originalPrice)
            }
        } else if(parsedString.contains("lower than in-store")){
            if(parsedSensitivity != null) {
                val originalPrice = (parsedPrice * 100)/(100 - parsedSensitivity)
                totalSensitivity += (parsedPrice - originalPrice)
            }
        }
    }
    
    return x >= totalSensitivity
}

/* Most Votes

*/