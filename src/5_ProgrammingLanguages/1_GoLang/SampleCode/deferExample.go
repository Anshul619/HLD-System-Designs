package main

import "log"

/**
Defer can be called for function, class method
- Reference - https://golangbot.com/defer/
*/
func finished(a int) {
	log.Println("Finished method - deferred - ", a)
}
func findLargestNumber(nums []int) {

	a := 5
	defer finished(a) // would be called at the end of findLargestNumber
	log.Println("findLargestNumber")

	a = 10
	max := nums[0]

	for _, v := range nums {
		if v > max {
			max = v
		}
	}

	log.Println("Largest number", max)
}

func main() {
	nums := []int{1, 3, 4}
	findLargestNumber(nums)
}
