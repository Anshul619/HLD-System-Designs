package oop

/**
Reference - https://golangbot.com/structs-instead-of-classes/
*/

import "log"

type Employee struct {
	FirstName   string
	LastName    string
	TotalLeaves int
	LeavesTaken int
}

// Package method - private method. Constructor.
func new(firstName string, lastName string, totalLeave int, leavesTaken int) Employee {

	// No need to specify object key. This is magic of comma.
	e := Employee{firstName, lastName, totalLeave, leavesTaken}
	return e
}

// Employee class method
func (e Employee) LeavesRemaining() {
	log.Println("Remaining Leaves - ", e.TotalLeaves-e.LeavesTaken)
}

func main() {

	emp1 := Employee{
		FirstName:   "Anshul",
		LastName:    "Agrawal",
		TotalLeaves: 10,
		LeavesTaken: 4,
	}

	emp1.LeavesRemaining()

	emp2 := new("Anshul", "Agrawal", 20, 5)

	emp2.LeavesRemaining()
}
