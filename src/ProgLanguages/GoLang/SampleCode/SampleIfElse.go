package main

/**
Reference - https://golangbot.com/if-statement/
*/
import "log"

func main() {

	isNumber := true

	if isNumber {
		log.Println("Number is true")
	} else { // else should be in the next line
		log.Println("Number is false")
	}

	if num := 11; num%2 == 0 {
		log.Println("Number is even")
	} else {
		log.Println("Number is odd")
	}
}
