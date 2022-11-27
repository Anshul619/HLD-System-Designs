/*
- There is no do-while loop in Go. [for loop](https://yourbasic.org/golang/do-while-loop/) can be used.
*/
for {
	work()
	if !condition {
		break
	}
}