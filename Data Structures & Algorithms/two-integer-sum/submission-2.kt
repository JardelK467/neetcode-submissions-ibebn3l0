class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexMap = nums.withIndex().associate { (index, value) -> value to index }
    for ((i, num) in nums.withIndex()) {
        val complement = target - num
        val j = indexMap[complement]
        if (j != null && j != i) {
            return intArrayOf(i, j)
        }
    }
    return intArrayOf()
}
}