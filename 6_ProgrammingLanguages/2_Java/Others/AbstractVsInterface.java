package DesignComponents.Java.Others;

/**
 * Availability of methods: Only abstract methods are available in interfaces, whereas non-abstract methods can be present along with abstract methods in abstract classes.
 * Variable types: Static and final variables can only be declared in the case of interfaces, whereas abstract classes can also have non-static and non-final variables.
 * Inheritance: Multiple inheritances are facilitated by interfaces, whereas abstract classes do not promote multiple inheritances.
 * Data member accessibility: By default, the class data members of interfaces are of the public-type. Conversely, the class members for an abstract class can be protected or private also.
 * Implementation: With the help of an abstract class, the implementation of an interface is easily possible. However, the converse is not true;
 *
 * https://www.interviewbit.com/java-interview-questions/
 */
public abstract class AbstractVsInterface {
    public abstract void walk();
}

interface Walkable {
    void walk();
}
