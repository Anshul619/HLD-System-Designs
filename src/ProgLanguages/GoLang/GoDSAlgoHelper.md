
# Function Defination & Basic Guidelines
- Type is defined at the end of declaration
- Return variables ( multiple variables ) would be defined at the end
- Multiple variables can be defined by `,`
- Initialisation can be skipped with `:=`
- Semicolon is not needed at the end


```go
package main

import "log"

func findNumber(list []int) {

	var1, var2 := 1, 2 // multiple variables, separated by comma

	log.Println(var1)
	log.Println(var2)
}

func findNumber1(list []int) (bool, error) {
	return false, nil;
}

func main() { // first calling function
}
```

| Purpose                             | Function |
|-------------------------------------|----------|
| Check if x string contains y string | strings.Contains(x, y)          |
| Compare two bytes array             | bytes.Compare(sl1, sl2)         |
|                                     |          |
|                                     |          |

# [How to asynchronously call the function?](https://medium.com/@gauravsingharoy/asynchronous-programming-with-go-546b96cd50c1)

````
go X()
````