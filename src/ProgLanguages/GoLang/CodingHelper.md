
# Basic Guidelines
- Type is defined at the end of declaration.
- Return variables ( multiple variables ) would be defined at the end.
- Multiple variables can be defined by `,`.
- Initialisation can be skipped with `:=`.
- Semicolon is not needed at the end.
- Trailing comma is needed while initializing struct.

```go
package main // folder name is generally specified as package name

import "log"

// Private method since starting character is small case
func findNumber(list []int) {

	var1, var2 := 1, 2 // multiple variables, separated by comma

	log.Println(var1)
	log.Println(var2)
}

// Public method since starting character is capital case
func FindNumber(list []int) (bool, error) {
	return false, nil
}

func main() { // first calling function
}
```

# Different constructs

| Purpose                             | Function |
|-------------------------------------|----------|
| Check if x string contains y string | strings.Contains(x, y)          |
| Compare two bytes array             | bytes.Compare(sl1, sl2)         |
|                                     |          |
|                                     |          |

# Multi-Threading
````
go X() // asynchrnously call X() function
````



