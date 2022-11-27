/*
- Reference - https://yourbasic.org/golang/implement-fifo-queue/
*/
package main

import "fmt"

func enqueue(queue []int, element int) []int {
  queue = append(queue, element); // Simply append to enqueue.
  fmt.Println("Enqueued:", element);
  return queue
}

func dequeue(queue []int) ([]int) {
  element := queue[0]; // The first element is the one to be dequeued.
  fmt.Println("Dequeued:", element)
  return queue[1:]; // Slice off the element once it is dequeued.
}

func main() {
  var queue []int; // Make a queue of ints.

  queue = enqueue(queue, 10);
  queue = enqueue(queue, 20);
  queue = enqueue(queue, 30);

  fmt.Println("Queue:", queue);

  queue = dequeue(queue);
  fmt.Println("Queue:", queue);

  queue = enqueue(queue, 40);
  fmt.Println("Queue:", queue);
}