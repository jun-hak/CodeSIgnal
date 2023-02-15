// 1,2 칸을 오를 수 있는 사람이 계단을 오른다고 가정
// F(n) = F(n-1) + F(n-2)

// 이것을 조금 응용해서 최소비용으로 계단 오르기
// [1,2,4,6,8,1,2,3,8] 의 비용이 주어지고 1,2만 오를 수 있다면
// 최종 목적지에서 1을 뺀 것을 y
// 최종 목적지에서 2을 뺀 것을 x
// 최종 목적지에서의 비용은 min(Fx + costX, Fy + costY)가 될 것
// F(0) = 0, F(1) = 0 한번에 올라갈 수 있는 계단은 1,2이기 때문
// 그러면 F(2) = min(F(0) + cost(0), F(1) + cost(1)) ==> min(0+1, 0+2) = 1
// 그러면 F(3) = min(F(1) + cost(1), F(2) + cost(2)) ==> min(0+2, 1+4) = 2
// F = [0, 0, 1, 2, 5, 8, 9, 9, 11, 12]가 될 것 같다.


val c = mutableListOf<Int>(1, 2, 4, 6, 8, 1, 2, 3, 8)
val totalCost = mutableListOf<Int>(0, 0)

// F = [0, 0, 1, 2, 5, 8, 9, 9, 11, 12]가 될 것 같다.
fun minCost(n: Int): Int {
    return if (totalCost.size <= n) {
        return min(minCost(n - 1) + c[n - 1], minCost(n - 2) + c[n - 2]).also {
            totalCost.add(it)
        }
    } else {
        totalCost[n]
    }
}