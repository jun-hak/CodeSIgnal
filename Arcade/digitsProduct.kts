// Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.


// 솔직히 이해가 안된다. 1은 output이 1이고, 나머지 소수는 -1이고 .. .. . . .. .. 머리가 나쁜가 ㅠ.ㅠ
// 이 문제는 내가 안풀고 그냥 넘어감.. ㅠ.ㅠ
// function solution(product) {
//     for(var i = 1; i<5000; i++) {
//         if(p(i) === product)return i;
//     }
//     function p (k) {
//         return String(k).split('').map(Number).reduce((a,b)=>a*b,1)
//     }
//     return -1;
// }



/*
fun solution(product: Int): Int {
    var p = product
    if( product < 10) {
        return if (product > 0)
            product
        else
            10
    }

    var r = ""
    for( i in 9 downTo 2){
        while (p % i == 0){
            p /= i
            r = Character.toString('0'+i) + r
        }
    }

    return when {
        p != 1 -> -1
        else -> r.toInt()
    }
}

 */