package main

import "log"

func swap(list []int) {

	for i, j := 0, len(list)-1; i < j; i, j = i+1, j-1 {
		list[i], list[j] = list[j], list[i]
	}
}

func main() {
	list := []int{1, 2, 3}
	swap(list)
	log.Println(list)
}
