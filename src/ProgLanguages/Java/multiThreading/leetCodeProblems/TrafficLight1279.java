package DesignComponents.Java.multiThreading.leetCodeProblems;

/**
 * LeetCode - https://leetcode.com/problems/traffic-light-controlled-intersection/submissions/
 */
public class TrafficLight1279 {

    // Signal maintains the road which is green at the moment
    private final Signal signal;

    public TrafficLight1279() {
        signal = new Signal();
    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {

        // signal is locked
        synchronized (signal) {
            if (roadId != signal.currentGreenRoad) {
                turnGreen.run();
                signal.currentGreenRoad = roadId;
            }

            crossCar.run();
        }

    }

    class Signal {

        // 1 corresponds to the Road A
        int currentGreenRoad = 1;
    }

}
