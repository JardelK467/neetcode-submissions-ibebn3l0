class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freq = HashMap<Int, Int>()
    val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }

    for (num in nums) freq[num] = freq.getOrDefault(num, 0) + 1
    for ((num, count) in freq) buckets[count].add(num)

    val result = mutableListOf<Int>()
    for (i in buckets.indices.reversed()) {
        for (num in buckets[i]) {
            if (result.size == k) return result.toIntArray()
            result.add(num)
        }
    }
    return result.toIntArray()
}
}
