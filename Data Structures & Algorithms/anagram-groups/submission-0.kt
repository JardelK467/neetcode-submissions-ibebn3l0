class Solution {
  fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val frequencySignatureMap = mutableMapOf<List<Int>, MutableList<String>>()

    for (word in strs) {
      val frequencyCount = IntArray(26)

      for (char in  word) {
        frequencyCount[char - 'a']++  
    }
    val key = frequencyCount.toList()
    frequencySignatureMap.getOrPut(key) { mutableListOf() }.add(word)  
}

    return frequencySignatureMap.values.toList()
  }
}