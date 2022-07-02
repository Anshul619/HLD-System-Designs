package DesignComponents.Java.OverloadingVsOverriding.SampleSuperKeyword;

class Child extends SampleSuperKeyword {
    private int num = 2;

    Child() {
        //System.out.println("Child class default Constructor");
        super();    // to call default parent constructor
        //super("Call Parent");    // to call parameterised constructor.
    }

    void printNum() {
        System.out.println(num);
        System.out.println(super.num); //prints the value of num of parent class
    }

    @Override
    public void foo() {
        System.out.println("Parent class foo!");
        super.foo();    //Calls foo method of Parent class inside the Overriden foo method of Child class.
    }
}
