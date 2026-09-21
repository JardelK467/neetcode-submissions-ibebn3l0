func hasDuplicate(nums []int) bool {

	//create map with set-like features
	m := map[int]bool{}

	//Add list value to map, duplicates get skipped
	for i := range nums {
		value := nums[i] 
		if _, seen := m[value]; seen { break }
		m[value] = true
	}

	//If the length of array and map is mismatched, theres a duplicate  
	return len(m) != len(nums)
}
