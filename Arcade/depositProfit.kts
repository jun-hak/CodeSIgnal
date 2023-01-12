// You have deposited a specific amount of money into your bank account. Each year your balance increases at the same growth rate. With the assumption that you don't make any additional deposits, find out how long it would take for your balance to pass a specific threshold.


fun solution(deposit: Int, rate: Int, threshold: Int): Int {
  var c = 0
  var new = deposit.toDouble()
  
  while(threshold > new) {
      new *= (1 + rate.toDouble() / 100)
      c++
  }
  return c
}
