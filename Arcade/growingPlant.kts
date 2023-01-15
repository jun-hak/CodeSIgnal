// Caring for a plant can be hard work, but since you tend to it regularly, you have a plant that grows consistently. Each day, its height increases by a fixed amount represented by the integer upSpeed. But due to lack of sunlight, the plant decreases in height every night, by an amount represented by downSpeed.
// // 
// Since you grew the plant from a seed, it started at height 0 initially. Given an integer desiredHeight, your task is to find how many days it'll take for the plant to reach this height.

fun solution(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var start = 0
    var reach = 0
    while(true) {
          reach++
        if(start + upSpeed >= desiredHeight) {
            break
        } else {
            start = start + upSpeed - downSpeed
        }
    }
    return reach
  }

  

  /*

  fun solution(upSpeed: Int, downSpeed: Int, desiredHeight: Int) = if (upSpeed > desiredHeight) 1 else (desiredHeight - downSpeed - 1) / (upSpeed - downSpeed) + 1
   */