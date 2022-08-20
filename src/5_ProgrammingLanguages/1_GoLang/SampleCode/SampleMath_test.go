package main

/**
- Reference - https://www.digitalocean.com/community/tutorials/how-to-write-unit-tests-in-go-using-go-test-and-the-testing-package
*/
import "testing"

func TestAdd(t *testing.T) {

	got := Add(5, 7)
	want := 13

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}
