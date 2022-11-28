package oop

/**
A variable of type interface can hold any value which implements the interface.
- This property of interfaces is used to achieve polymorphism in Go.

References
- https://golangbot.com/polymorphism/
- https://www.geeksforgeeks.org/golang-polymorphism-using-interfaces/?ref=lbp
*/
import (
	"fmt"
)

type Income interface {
	calculate() int
	source() string
}

type FixedBilling struct {
	projectName  string
	biddedAmount int
}

type TimeAndMaterial struct {
	projectName string
	noOfHours   int
	hourlyRate  int
}

type Advertisement struct {
	adName     string
	CPC        int
	noOfClicks int
}

func (ad Advertisement) calculate() int {
	return ad.CPC * ad.noOfClicks
}

func (ad Advertisement) source() string {
	return ad.adName
}

// FixedBilling implementing Income interface by implementing calculate() method
func (fb FixedBilling) calculate() int {
	return fb.biddedAmount
}

func (fb FixedBilling) source() string {
	return fb.projectName
}

func (tm TimeAndMaterial) calculate() int {
	return tm.noOfHours * tm.hourlyRate
}

func (tm TimeAndMaterial) source() string {
	return tm.projectName
}

func calculateNetIncome(ic []Income) {
	var netincome int = 0
	for _, income := range ic {
		fmt.Printf("Income From %s = $%d\n", income.source(), income.calculate())
		netincome += income.calculate()
	}
	fmt.Printf("Net income of organization = $%d", netincome)
}

func main() {
	project1 := FixedBilling{projectName: "Project 1", biddedAmount: 5000}
	project2 := FixedBilling{projectName: "Project 2", biddedAmount: 10000}
	project3 := TimeAndMaterial{projectName: "Project 3", noOfHours: 160, hourlyRate: 25}
	bannerAd := Advertisement{"Mailchimp", 2, 3}
	popupAd := Advertisement{"Mailchimp1", 5, 10}

	incomeStreams := []Income{project1, project2, project3, bannerAd, popupAd}
	calculateNetIncome(incomeStreams)
}
