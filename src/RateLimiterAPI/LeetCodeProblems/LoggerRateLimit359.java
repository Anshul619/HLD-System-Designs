package RateLimiterAPI.LeetCodeProblems;

import java.util.HashMap;

/**
 * LeetCode - https://leetcode.com/problems/logger-rate-limiter/solution/
 * Time Complexity - O(1)
 * Space Complexity - O(M) //all unique messages in the queue
 */
public class LoggerRateLimit359 {

    HashMap<String, Integer> loggerCounter;

    public LoggerRateLimit359() {
        loggerCounter = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {

        if (loggerCounter.containsKey(message)) {

            if ((timestamp - loggerCounter.get(message)) >= 10) {
                loggerCounter.put(message, timestamp);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            loggerCounter.put(message, timestamp);
            return true;
        }
    }

    public static void main(String[] args) {

        LoggerRateLimit359 logger = new LoggerRateLimit359();

        System.out.println(logger.shouldPrintMessage(1, "foo"));
        System.out.println(logger.shouldPrintMessage(2, "bar"));
        System.out.println(logger.shouldPrintMessage(3, "foo"));
        System.out.println(logger.shouldPrintMessage(8, "bar"));
        System.out.println(logger.shouldPrintMessage(10, "foo"));
        System.out.println(logger.shouldPrintMessage(11, "foo"));
    }
}
