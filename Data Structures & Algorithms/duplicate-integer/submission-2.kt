class Solution {
    fun hasDuplicate(nums: IntArray): Boolean = nums.toSet().size != nums.size
}
