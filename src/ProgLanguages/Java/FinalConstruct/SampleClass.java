package DesignComponents.Java.FinalConstruct;

/**
 * No classes can be inherited from the class declared as final.
 * - But that final class can extend other classes for its usage.
 *
 * https://www.interviewbit.com/java-interview-questions/
 */
public class SampleClass {

    static final int i = 0;

    public final void finalMethod() {
        System.out.println("Final method can't be changed");
    }

    public static void main(String[] args) {
        //i = 10; // ERROR - final variable can't be changed.
    }

}
