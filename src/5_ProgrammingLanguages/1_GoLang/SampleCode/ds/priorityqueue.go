package main

import "container/heap"

type task struct {
  name      int
  frequency int
}

// tasksPriorityQueue would have  to implement all methods of heap interface like Len(), Less(), Swap(), Push() etc.
type tasksPriorityQueue []task

func (h tasksPriorityQueue) Len() int {
  return len(h)
}

func (h tasksPriorityQueue) Less(i int, j int) bool {
  return h[i].frequency > h[j].frequency
}

func (h tasksPriorityQueue) Swap(i int, j int) {
  h[i], h[j] = h[j], h[i]
}

func (h *tasksPriorityQueue) Push(a interface{}) {
  *h = append(*h, a.(task))
}

func (h *tasksPriorityQueue) Pop() interface{} {
  l := len(*h)
  res := (*h)[l-1]
  *h = (*h)[:l-1]
  return res
}

func main() {

  pq := new(tasksPriorityQueue)
  temp := task{name: 20, frequency: 1}
  heap.Push(pq, temp)

  if pq.Len() > 0 {
	  temp1 := heap.Pop(pq).(task) // typecasting for task
  }
}