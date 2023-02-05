fun solution(a: Int, b: Int, c: Int): Boolean {
    return (a + b == c) || (a-b==c) || (a * b == c) || (b!=0 && b * c == a)
  }
