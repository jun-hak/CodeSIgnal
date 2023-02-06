fun solution(a: Int): Int {
    var t = a
    var r = ""
    while(t != 0) {
        r += (t and 0x01).toString()
        t = t shr 1
    }

    return if(r.isEmpty()) 0 else r.toInt(2)
}

/* String쓰지 말아야하는데!!
int solution(int a) {
int b = 0;
  while (a > 0) {
    b <<= 1;
    b |= a & 1;
    a >>= 1;
  }

  return b;
}
 */