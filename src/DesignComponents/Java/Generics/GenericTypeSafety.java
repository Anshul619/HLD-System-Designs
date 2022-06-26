package DesignComponents.Java.Generics;

import java.util.ArrayList;

public class GenericTypeSafety {

    /**
     * Incorrect - No Generic Specified
     */
    static private void noGenericSpecified() {
        // Creating an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);
    }

    /**
     * Correct - Generic Specified
     */
    static private void genericSpecified() {
        // Creating an ArrayList without any type specified
        ArrayList<String> al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        //al.add(10); // compile time error

        String s1 = al.get(0);
        String s2 = al.get(1);

        // Causes Runtime Exception
        String s3 = al.get(2);
    }

    public static void main(String[] args)
    {
        noGenericSpecified();
        genericSpecified();
    }
}
