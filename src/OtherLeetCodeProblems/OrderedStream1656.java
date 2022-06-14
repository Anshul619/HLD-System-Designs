package OtherLeetCodeProblems; /**
 * LeetCode - https://leetcode.com/problems/design-an-ordered-stream/
 * TimeComplexity - O(n)
 * Space Complexity - O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class OrderedStream1656 {

    String[] stream;

    int currentPointer;

    public OrderedStream1656(int n) {
        stream = new String[n];
        currentPointer = 0;
    }

    public List<String> insert(int idKey, String value) {

        stream[idKey-1] = value;

        List<String> output = new ArrayList<>();

        while(currentPointer < stream.length && stream[currentPointer] != null) {
            output.add(stream[currentPointer]);
            currentPointer++;
        }

        //System.out.println("Stream ->" + Arrays.toString(stream));
        //System.out.println("Current Pointer ->" + currentPointer);
        //System.out.println("Max Pointer ->" + maxPointer);

        return output;

    }

    public static void main(String[] args) {

        OrderedStream1656 obj = new OrderedStream1656(5);
        System.out.println(obj.insert(3, "ccccc"));
        System.out.println(obj.insert(1, "aaaaa"));
        System.out.println(obj.insert(2, "bbbbb"));
        System.out.println(obj.insert(5, "eeeee"));
        System.out.println(obj.insert(4, "ddddd"));

    }
}
