class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        //total amount of letters in the alphabet
        val freq = IntArray(26)


        for(c in s) freq[c - 'a']++
        for(c in t) freq[c - 'a']--

        return freq.all { it == 0 } 
    }
}