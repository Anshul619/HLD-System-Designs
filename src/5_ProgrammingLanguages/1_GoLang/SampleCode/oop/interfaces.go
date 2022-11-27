package main

import "fmt"

// "Triangle" data type
type Triangle struct {
	base, height float32
}

// "Square" data type
type Square struct {
	length float32
}

// "Rectangle" data type
type Rectangle struct {
	length, breadth float32
}

// To calculate area of triangle
func (triangle Triangle) Area() float32 {
	return 0.5 * triangle.base * triangle.height
}

// To calculate area of square
func (square Square) Area() float32 {
	return square.length * square.length
}

// To calculate area of rectangle
func (rect Rectangle) Area() float32 {
	return rect.length * rect.breadth
}

// Area interface for achieving abstraction
type Area interface {
	Area() float32
}

func main() {
	// Declare and assign values to variables
	triangleObject := Triangle{base: 20, height: 10}
	squareobject := Square{length: 25}
	rectObject := Rectangle{length: 15, breadth: 20}

	// Define a variable of type interface
	var shapeObject Area

	// Assign to "Triangle" type variable to the Area interface
	shapeObject = triangleObject
	fmt.Println("Triangle Area = ", shapeObject.Area())

	// Assign to "Square" type variable to the Area interface
	shapeObject = squareobject
	fmt.Println("Square Area = ", shapeObject.Area())

	// Assign to "Rectangle" type variable to the Area interface
	shapeObject = rectObject
	fmt.Println("Rectangle Area = ", shapeObject.Area())
}