class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0 // stores final result
        var count = 0 // stores count for ones

        nums.forEach { i ->
           if(i ==1) {
            count++ 
            if(result < count) result = count
           }
           if(i == 0) count = 0
           }
           return result
    }
}

