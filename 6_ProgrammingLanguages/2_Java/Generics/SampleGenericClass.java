package DesignComponents.Java.Generics;

/**
 * https://www.geeksforgeeks.org/generics-in-java/
 *
 * @param <T>
 */
public class SampleGenericClass<T> {

    // An object of type T is declared
    T obj;

    SampleGenericClass(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {

        SampleGenericClass<Integer> integerObj = new SampleGenericClass<>(15);
        System.out.println(integerObj.getObject());

        SampleGenericClass<String> stringObj = new SampleGenericClass<>("Anshul Agrawal");
        System.out.println(stringObj.getObject());

        //integerObj = stringObj; // Type Cast error
    }

}
