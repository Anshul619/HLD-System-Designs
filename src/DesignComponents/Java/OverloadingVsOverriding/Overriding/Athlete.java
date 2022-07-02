package DesignComponents.Java.OverloadingVsOverriding.Overriding;

/**
 * Method overriding is the concept in which two methods having the same method signature are present in two different classes in which an inheritance relationship is present.
 * - A particular method implementation (already present in the base class) is possible for the derived class by using method overriding.
 * - https://www.interviewbit.com/java-interview-questions/
 */


public class Athlete extends HumanBeing{

    @Override
    public int walk(int distance, int time) {
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}
