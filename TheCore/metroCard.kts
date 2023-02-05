fun solution(lastNumberOfDays: Int): MutableList<Int> {
    return if(lastNumberOfDays == 30 || lastNumberOfDays == 28)
          mutableListOf(31)
      else
          mutableListOf(28, 30, 31) 
  }
