// Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.



fun solution(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> 
= inputArray.map { if(it == elemToReplace) substitutionElem else it }.toMutableList()