package DesignComponents.Java.Others;

public class SampleShallowDeepCopy {

    int length = 5;
    int breadth = 3;

    public static void main(String[] args)  {

        SampleShallowDeepCopy obj1 = new SampleShallowDeepCopy();

        SampleShallowDeepCopy obj2 = obj1; // Shallow Copy

        SampleShallowDeepCopy obj3 = new SampleShallowDeepCopy(); // Deep Copy
        obj3.length = obj1.length;
        obj3.breadth = obj1.breadth;

        obj2.length = 10;

        System.out.println("obj1.length ->" + obj1.length); // 10 due to shallow copy

        try {
            SampleShallowDeepCopy obj4 = (SampleShallowDeepCopy) obj1.clone(); // Deep copy
        }
        catch (CloneNotSupportedException exception) {

        }

    }

}
