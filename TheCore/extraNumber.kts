fun solution(a: Int, b: Int, c: Int): Int {
    return if(a == b) {
        c
    } else {
        if(a == c) {
            b
        } else {
            a
        }
    }
}


// self를 xor하면 0되는거 이용했구나 ㅠㅠㅠㅠㅠㅠ
/*
fun solution(a: Int, b: Int, c: Int): Int {
    return a.xor(b).xor(c)
}

 */