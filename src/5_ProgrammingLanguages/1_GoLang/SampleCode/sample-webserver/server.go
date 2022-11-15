//go:build ignore

/*
References
- https://go.dev/doc/articles/wiki/
- https://blog.logrocket.com/creating-a-web-server-with-golang/

go run server.go

*/
package main

import (
    "fmt"
    "log"
    "net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
    fmt.Fprintf(w, "Hi there, I love %s!", r.URL.Path[1:])
}

func main() {
	http.HandleFunc("/", handler)
	log.Fatal(http.ListenAndServe(":8080", nil)) // Run app server on 8080 port
}