fun solution(picture: MutableList<String>): MutableList<String> {
 return picture.map{a -> "*" + a + "*"}.toMutableList().apply {
      add(0, "*".repeat(picture[0].length + 2))
      add("*".repeat(picture[0].length + 2))
      }
}



/*
    fun solution(picture: MutableList<String>): MutableList<String>
     = picture
     .apply { add(0,"*".repeat(picture[0].length)) }
     .apply { add("*".repeat(picture[0].length)) }
     .apply { forEachIndexed { index, s -> picture[index] = "*$s*" } }
*/
