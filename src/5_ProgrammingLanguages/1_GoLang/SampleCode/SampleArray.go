package main

import "log"

func main() {

	var a [3]int // all elements as 0
	log.Println(a)

	a[0] = 10
	a[1] = 11
	a[2] = 12
	log.Println(a)

	b := [3]int{1, 2, 3}
	log.Println(b)

	c := [3]int{12} // first element as 12
	log.Println(c)

	for _, v := range c {
		log.Println(v)
	}

	cSlice := c[0:1]
	log.Println(cSlice)
}
