// You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?

// Note that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.

fun solution(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    return if(weight1 + weight2 <= maxW) {
        value1 + value2 
    } else if(weight1 <= maxW && weight2 <= maxW) {
        Math.max(value1, value2)
    } else if(weight1 <= maxW) {
        value1
    } else if(weight2 <= maxW) {
        value2
    } else {
        0
    }
  }
  