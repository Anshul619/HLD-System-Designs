package DesignComponents.Java.OverloadingVsOverriding;

/**
 * In Java, method overloading is made possible by introducing different methods in the same class consisting of the same name.
 * - Still, all the functions differ in the number or type of parameters. It takes place inside a class and enhances program readability.
 * - Yes! There can be two or more static methods in a class with the same name but differing input parameters.
 * Reference - https://www.interviewbit.com/java-interview-questions/
 *
 *
 *
 * - No! Declaration of static methods having the same signature can be done in the subclass but run time polymorphism can not take place in such cases.
 * - Overriding or dynamic polymorphism occurs during the runtime, but the static methods are loaded and looked up at the compile time statically. Hence, these methods cant be overridden.
 */
public class MainMethodOverloading {

    // JVM has a predefined calling method that JVM will only call this main method.
    public static void main(String args[]) {
        System.out.println(" Main Method");
    }
    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }

    public static void main(float args){
        System.out.println("Overloaded float Main Method");
    }
}
