package DesignComponents.Java.Others;

public class SampleFinalize {

    public static void main(String[] args) {
        String example = new String("InterviewBit");
        example = null;
        System.gc(); // Garbage collector called
    }

    // Prior to the garbage collection of an object, the finalize method is called so that the clean-up activity can be implemented.
    public void finalize() {
        // Finalize called
        System.out.println("Finalize is called");
    }

}
