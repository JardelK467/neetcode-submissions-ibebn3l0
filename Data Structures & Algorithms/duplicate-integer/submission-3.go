func hasDuplicate(nums []int) bool {
	//Empty case check
	if len(nums) == 0 { return false } 

	//map creation
    m := map[int]bool{}

	// loop through list to populate empty map
	for i := range nums {
		value := nums[i]
		if seen, _ := m[value]; seen {
			return true
		}
		m[nums[i]] = true
	} 
	
		return false
}
