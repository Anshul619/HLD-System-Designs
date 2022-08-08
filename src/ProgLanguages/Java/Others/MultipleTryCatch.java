package DesignComponents.Java.Others;

/**
 * A single try block and multiple catch blocks can co-exist in a Java Program.
 *
 * https://www.interviewbit.com/java-interview-questions/
 */
public class MultipleTryCatch {
    public static void main(String args[]) {

        try {
            int n = 1000, x = 0;
            int arr[] = new int[n];
            for (int i = 0; i <= n; i++) {
                arr[i] = i / x;
            }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("1st block = ArrayIndexOutOfBoundsException"); // Would be thrown if x is greater than 0
        }
        catch (ArithmeticException exception) {
            System.out.println("2nd block = ArithmeticException"); // Should be thrown since x=0
        }
        catch (Exception exception) {
            System.out.println("3rd block = Exception");
        }
    }
}
