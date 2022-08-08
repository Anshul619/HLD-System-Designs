package main

import (
	"log"
	"strings"
)

func main() {
	string1 := "You are welcome"

	res1 := strings.Contains(string1, "welcome")

	log.Println(res1)
}
