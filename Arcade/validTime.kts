// Check if the given string is a correct time representation of the 24-hour clock.

fun solution(time: String): Boolean {
    val spilt = time.split(":")

    if(!spilt.all{ str -> str.all { it.isDigit() }})
        return false
    if(spilt[0].toInt() > 23 || spilt[0].toInt() < 0)
        return false
    if(spilt[1].toInt() > 59 || spilt[1].toInt() < 0)
        return false

    return true
}


/*
fun solution(time: String): Boolean = (time.substring(0..1).toInt() in 0..23) && (time.substring(3..4).toInt() in 0..59)

 */