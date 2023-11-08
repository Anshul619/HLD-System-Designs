package RateLimiterAPI.LeetCodeProblems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode - https://leetcode.com/problems/design-hit-counter/
 */

public class HitCounter362 {

    Queue<Integer> queue;

    public HitCounter362() {
        queue = new LinkedList<>();
    }

    public void hit(int timestamp) {
        queue.add(timestamp);
    }

    public int getHits(int timestamp) {

        System.out.println("timestamp ->" + timestamp);
        System.out.println("Before ->" + queue);
        System.out.println("Queue peek ->" + queue.peek());
        while (!queue.isEmpty() && (timestamp - queue.peek()) >= 300) {
            System.out.println("Remove");
            queue.remove();
        }

        System.out.println("After ->" + queue);
        return queue.size();
    }

    public static void main(String[] args) {

        HitCounter362 obj = new HitCounter362();

        /*obj.hit(1);
        obj.hit(2);
        obj.hit(3);
        System.out.println(obj.getHits(4));
        obj.hit(300);
        System.out.println(obj.getHits(300));
        System.out.println(obj.getHits(301));*/

        obj.hit(1);
        obj.hit(1);
        obj.hit(1);
        obj.hit(300);
        System.out.println(obj.getHits(300));
        obj.hit(300);
        System.out.println(obj.getHits(300));
        obj.hit(301);
        System.out.println(obj.getHits(301));
    }
}
