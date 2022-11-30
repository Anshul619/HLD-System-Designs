# Introduction
- [Panic & Recover](https://golangbot.com/panic-and-recover/) is like exception in GoLang.
- There is no try-&-catch in GoLang.
- [Read more](https://golangbot.com/custom-errors/)

# Return errors 
- Errors can be returned as multiple values from a function in Go

```go

package main
import (
	"fmt"
)

func reverseValues(a,b string)(string, string){
    return b,a    //notice how multiple values are returned
}

func main(){
    val1,val2:= reverseValues("interview","bit")    // notice how multiple values are assigned
    fmt.Println(val1, val2)
}
```

# Custom Errors in GoLang

````go
package errors

// New returns an error that formats as the given text.
// Each call to New returns a distinct error value even if the text is identical.
func New(text string) error {  
        return &errorString{text}
}

// errorString is a trivial implementation of error.
type errorString struct {  
        s string
}

func (e *errorString) Error() string {  
        return e.s
}
````

