package LLDCodeProblems.LeetCodeProblems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode - https://leetcode.com/problems/moving-average-from-data-stream/
 * TimeComplexity - O(1)
 * SpaceComplexity - O(n)
 */
public class MovingAverageFromDataStream346 {

    private Queue<Integer> streamQueue = new LinkedList<>();
    private int maxCapacity = 0;

    private int totalSum = 0;

    public MovingAverageFromDataStream346(int size) {
        streamQueue = new LinkedList<>();
        maxCapacity = size;
        totalSum = 0;
    }

    public double next(int val) {

        totalSum += val;
        streamQueue.add(val);

        if (streamQueue.size() > maxCapacity) {
            totalSum -= streamQueue.remove();
        }

        double average = 0.0;

        //System.out.println(totalSum);
        //System.out.println(streamQueue.size());
        if (!streamQueue.isEmpty()) {
            average = (double) totalSum/streamQueue.size();
        }

        return average;

    }

    public static void main(String[] args) {
        MovingAverageFromDataStream346 obj = new MovingAverageFromDataStream346(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}
