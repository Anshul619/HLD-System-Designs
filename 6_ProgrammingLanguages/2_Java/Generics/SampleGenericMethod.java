package DesignComponents.Java.Generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 */
public class SampleGenericMethod {

    <T> void genericMethod(T element) {
        System.out.println(element.getClass().getName() + " - " + element);
    }

    public static void main(String[] args) {

        SampleGenericMethod obj = new SampleGenericMethod();

        obj.genericMethod(20);
        obj.genericMethod("Anshul Agrawal");
        obj.genericMethod(1.0);
    }
}
