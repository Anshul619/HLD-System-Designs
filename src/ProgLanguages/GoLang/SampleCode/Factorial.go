package main

import "log"

func factorial(num int) int {

	if num == 0 {
		return 1
	}

	return num * factorial(num-1)

}
func main() {
	log.Println(factorial(7))
}
