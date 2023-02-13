fun List<T>.subsets(): List<List<T>> {
    if (this.isEmpty()) return listOf(emptyList())
    val element = this.first()
    val subsetsWithoutFirst = this.drop(1).subsets()
    return subsetsWithoutFirst + subsetsWithoutFirst.map { it + element }
}