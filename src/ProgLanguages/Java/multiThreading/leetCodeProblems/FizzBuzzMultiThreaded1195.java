package DesignComponents.Java.multiThreading.leetCodeProblems;

/**
 * LeetCode - https://leetcode.com/problems/fizz-buzz-multithreaded/
 */

import java.util.concurrent.Semaphore;

class FizzBuzzMultiThreaded1195 {

    private int n;
    private int current;
    private int fizzBuzzTotal;
    private int fizzTotal;
    private int buzzTotal;
    private int numTotal;
    private Semaphore fizzBuzzSem = new Semaphore(0);
    private Semaphore fizzSem = new Semaphore(0);
    private Semaphore buzzSem = new Semaphore(0);
    private Semaphore numSem = new Semaphore(1);


    public FizzBuzzMultiThreaded1195(int n) {
        this.n = n;
        this.current = 1;
        // figure out how many total times each thing should print
        this.fizzBuzzTotal = n/15;
        this.fizzTotal = n/3 - fizzBuzzTotal;
        this.buzzTotal = n/5 - fizzBuzzTotal;
        this.numTotal = n - fizzTotal - buzzTotal - fizzBuzzTotal;

    }

    private void signalNext() {
        current++;
        if (current % 15 == 0) {
            fizzBuzzSem.release();
        } else if (current % 3 == 0) {
            fizzSem.release();
        } else if (current % 5 == 0) {
            buzzSem.release();
        } else {
            numSem.release();
        }
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 0; i < fizzTotal; i++) {
            fizzSem.acquire();
            printFizz.run();
            signalNext();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 0; i < buzzTotal; i++) {
            buzzSem.acquire();
            printBuzz.run();
            signalNext();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 0; i < fizzBuzzTotal; i++) {
            fizzBuzzSem.acquire();
            printFizzBuzz.run();
            signalNext();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    /*public void number(IntConsumer printNumber) throws InterruptedException {
        int num = 1;
        for (int i = 0; i < numTotal; i++) {
            numSem.acquire();
            printNumber.accept(num);
            // find the next number
            num++;
            while (num % 3 == 0 || num % 5 == 0) {
                num++;
            }
            signalNext();
        }
    }*/
}
