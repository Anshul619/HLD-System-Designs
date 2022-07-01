package DesignComponents.Java.OverloadingVsOverriding;

/**
 * Constructor overloading is the process of creating multiple constructors in the class consisting of the same name with a difference in the constructor parameters.
 *
 * Depending upon the number of parameters and their corresponding types, distinguishing of the different types of constructors is done by the compiler.
 *
 * Reference - https://www.interviewbit.com/java-interview-questions/
 */


class SampleConstructorOverloading {
    int variable1, variable2;
    double variable3;

    public SampleConstructorOverloading(int doctors, int nurses) {
        variable1 = doctors;
        variable2 = nurses;
    }

    public SampleConstructorOverloading(int doctors) {
        variable1 = doctors;
    }

    public SampleConstructorOverloading(double salaries) {
        variable3 = salaries;
    }
}