package DesignComponents.Java.multiThreading.leetCodeProblems;

import java.util.concurrent.Semaphore;

/**
 * LeetCode - https://leetcode.com/problems/print-in-order/
 */
class PrintInOrder1114 {

    private Semaphore sem1;
    private Semaphore sem2;

    public PrintInOrder1114() throws InterruptedException {
        sem1 = new Semaphore(1);
        sem2 = new Semaphore(1);

        try {
            sem1.acquire();
            sem2.acquire();
        }
        catch (InterruptedException e) {

        }

    }

    static class printFirst implements Runnable{

        @Override
        public void run() {
            System.out.println("first");
        }

    }

    static class printSecond implements Runnable{

        @Override
        public void run() {
            System.out.println("second");
        }

    }

    static class printThird implements Runnable{

        @Override
        public void run() {
            System.out.println("third");
        }

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        sem1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // If sem1 is not released yet, we shouldn't move forward. Hence sem1.acquire() would wait until its released.
        // If sem1 is already released, acquire would work. Hence flow is correct.
        sem1.acquire();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        sem2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        sem2.acquire();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {

        PrintInOrder1114 obj = new PrintInOrder1114();

        Runnable printFirst = new printFirst();
        Runnable printSecond = new printSecond();
        Runnable printThird = new printThird();

        //obj.third(printThird);
        obj.second(printSecond);
        obj.first(printFirst);
        //obj.second(printSecond);

    }
}
