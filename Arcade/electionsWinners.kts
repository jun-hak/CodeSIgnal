// Elections are in progress!

// Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.

// The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.


fun solution(votes: MutableList<Int>, k: Int): Int {
    val sorted = votes.sortedDescending()
    val max = sorted.first()
    return if(k==0)
        if(sorted.filter { it == max }.size == 1)
            1
        else
            0
        else sorted.filter { it + k > max  }.size
}

/*
fun solution(votes: MutableList<Int>, k: Int): Int {
    val max  = votes.max()
    val result = votes.filter { it + k > max!! }.size
    return if (result == 0 && votes.filter { it == max }.size == 1)
        1
    else
        result
}
 */