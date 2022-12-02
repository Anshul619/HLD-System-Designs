# Introduction
- Create a new file ending in _test.go in the same directory as your package sources. 
- Inside that file, import "testing" and write functions of the form.
- Run go test in that directory. That script finds the Test functions, builds a test binary, and runs it.

````go
func TestFoo(t *testing.T) {
    ...
}
````
  

# References
- [How to write unit tests in GoLang?](https://blog.alexellis.io/golang-writing-unit-tests/)