//Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
//
//The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.
//
//Return the blurred image as an integer, with the fractions rounded down.

fun solution(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val h = image.size
    val w = if (h > 0) image[0].size else 0
    if (w < 3 || h < 3)
        return mutableListOf()

    val filter = mutableListOf<MutableList<Int>>()
    for (i in 1 until h - 1) {
        val t = mutableListOf<Int>()
        for (j in 1 until w - 1) {
            t.add(getWeight(i, j, image))
        }
        filter.add(t)
    }
    return filter
}


fun getWeight(i: Int, j: Int, image: MutableList<MutableList<Int>>) =
    (image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1] + image[i][j - 1] + image[i][j] + image[i][j + 1] + image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1]) / 9


/*
fun solution(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> =
        (1 until image.lastIndex).map { x ->
            (1 until image[x].lastIndex).map { y ->
                image.slice(x - 1..x + 1)
                        .flatMap { it.slice(y - 1..y + 1) }
                        .sum() / 9
            }.toMutableList()
        }.toMutableList()
*/