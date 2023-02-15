// [2,3,5] 3종류의 동전을 조합하여 11을 만들어 봐!
// 점화식을 세우면 F(n) = min(F(n-2), F(n-3), F(n-5)) + 1
// 1 만들지 못함
// 2 한 개 필요
// 3 한 개 필요
// 4 두 개 필요 (F(4) = min(F(2), F(1)) + 1)
// 5 한 개 필요
// 6 두 개 필요 (F(6) = min(F(4), F(3), F(1)) + 1)

// fun findMinCoin(target: Int) {
//     val s = MutableList(target + 1) {
//         Int.MAX_VALUE
//     }
//     s[0] = 0
//     s[2] = 1
//     s[3] = 1
//     s[5] = 1
//     for (idx in 0 .. target) {
//         val c1 = if(idx - 2 < 0) Int.MAX_VALUE else s[idx - 2]
//         val c2 = if(idx - 3 < 0) Int.MAX_VALUE else s[idx - 3]
//         val c3 = if(idx - 5 < 0) Int.MAX_VALUE else s[idx - 5]
//         val minV = minOf(c1, c2, c3)
//         if(minV != Int.MAX_VALUE)
//             s[idx] = minOf(c1, c2, c3) + 1
//     }

//     println(s)
// }