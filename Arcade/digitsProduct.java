// Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.




fun getFolderNames(names: Array<String>): Array<String> {
    val res = Array(names.size) { "" }
    val recordCount = HashMap<String, Int>()
    for (i in names.indices) {
        if (recordCount.containsKey(names[i])) {
            var index = recordCount[names[i]]!! + 1
            var t = "${names[i]}($index)"
            while (recordCount.containsKey(t)) {
                index++
                t = "${names[i]}($index)"
            }
            recordCount[names[i]] = index
            recordCount[t] = 0
            res[i] = t
        } else {
            recordCount[names[i]] = 0
            res[i] = names[i]
        }
    }
    return res
}
/*

 */