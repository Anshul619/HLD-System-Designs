package main

import "log"

func main() {
	for i := 0; i < 10; i++ {
		log.Println(i)

		if i > 5 {
			break
		}
	}

	i := 1
	for i > 10 {
		i += 2
		log.Println(i)
	}
}
