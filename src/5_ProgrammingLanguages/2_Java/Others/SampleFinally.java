package DesignComponents.Java.Others;

public class SampleFinally {

    public static void main(String[] args) {
        try {
            int variable = 5;
        }
        catch (Exception exception) {
            System.out.println("Exception occurred");
        }
        finally {
            // It is the block present in a program where all the codes written inside it get executed irrespective of handling of exceptions
            // finally block will be executed irrespective of the exception or not.
            // The only case where finally block is not executed is when it encounters ‘System.exit()’ method anywhere in try/catch block.
            System.out.println("Execution of finally block");
        }
    }
}
