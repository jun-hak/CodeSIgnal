fun solution(a: Int, b: Int): Int {
    return (a..b).sumOf {
        var t = it
        var r = 0
        while (t != 0) {
            if (t and 0x01 == 1) {
                r++
            }
            t = t shr 1
        }
        r
    }
}
