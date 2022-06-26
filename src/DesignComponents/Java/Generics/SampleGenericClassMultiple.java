package DesignComponents.Java.Generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 *
 * @param <A>
 * @param <B>
 */
public class SampleGenericClassMultiple<A, B> {

    A obj1;
    B obj2;

    SampleGenericClassMultiple(A obj1, B obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {

        SampleGenericClassMultiple<Integer, String> multipleGeneric = new SampleGenericClassMultiple<>(15, "Anshul");
        multipleGeneric.print();
    }
}
