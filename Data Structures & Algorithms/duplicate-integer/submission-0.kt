class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>(nums.size)
        
        for(i in nums) {
            if (!hashSet.add(i)) return true
            // A more functional way of handling conditional expressions       
            }
            return false
    }
}
