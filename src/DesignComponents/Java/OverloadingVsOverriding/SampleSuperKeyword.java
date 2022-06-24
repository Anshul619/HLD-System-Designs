package Java.OverloadingVsOverriding;

/**
 * The super keyword is used to access hidden fields and overridden methods or attributes of the parent class.
 *
 * Following are the cases when this keyword can be used:
 * - Accessing data members of parent class when the member names of the class and its child subclasses are same.
 * - To call the default and parameterized constructor of the parent class inside the child class.
 *
 * Accessing the parent class methods when the child classes have overridden them.
 *
 * LeetCode - https://www.interviewbit.com/java-interview-questions/
 */
public class SampleSuperKeyword {
    protected int num = 1;

    SampleSuperKeyword(){
        System.out.println("Parent class default constructor.");
    }

    SampleSuperKeyword(String x){
        System.out.println("Parent class parameterised constructor.");
    }

    public void foo(){
        System.out.println("Parent class foo!");
    }
}

class Child extends SampleSuperKeyword {
    private int num = 2;

    Child(){
        //System.out.println("Child class default Constructor");

        super();    // to call default parent constructor
        //super("Call Parent");    // to call parameterised constructor.
    }

    void printNum(){
        System.out.println(num);
        System.out.println(super.num); //prints the value of num of parent class
    }

    @Override
    public void foo(){
        System.out.println("Parent class foo!");
        super.foo();    //Calls foo method of Parent class inside the Overriden foo method of Child class.
    }
}