/*
- Be careful with passing array in recursion (DFS).
- Array would have to be initialized new while passing.
- Reference - https://leetcode.com/problems/all-paths-from-source-to-target/submissions/
*/
for _, v := range graph[num] {
    temp1 := []int{}
    temp1 = append(temp1, *temp...)
    util(graph, &temp1, out, v, target)
}