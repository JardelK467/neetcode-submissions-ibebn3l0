func hasDuplicate(nums []int) bool {
seen := make(map[int]struct{}) // create a set-like map

//Loop through list and stop when duplicates found in list through the set
for _, n := range nums {
    if _, ok := seen[n]; ok {
        return true
    }
    seen[n] = struct{}{} //
}

return false
}
