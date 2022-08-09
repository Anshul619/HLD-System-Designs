package main

/**
Reference - https://golangbot.com/maps/
*/
import (
	"log"
)

type employee struct {
	salary  int
	country string
}

func main() {
	emp1 := employee{
		salary:  12000,
		country: "USA",
	}
	emp2 := employee{
		salary:  14000,
		country: "Canada",
	}
	emp3 := employee{
		salary:  13000,
		country: "India",
	}
	employeeInfo := map[string]employee{
		"Steve": emp1,
		"Jamie": emp2,
		"Mike":  emp3,
	}

	for name, info := range employeeInfo {
		log.Printf("Employee: %s Salary:$%d  Country: %s\n", name, info.salary, info.country)
	}

}
