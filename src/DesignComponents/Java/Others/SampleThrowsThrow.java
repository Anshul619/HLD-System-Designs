package DesignComponents.Java.Others;

/**
 * - The ‘throw’ keyword is used to manually throw the exception to the calling method.
 * - And the ‘throws’ keyword is used in the function definition to inform the calling method that this method throws the exception. So if you are calling, then you have to handle the exception.
 * https://www.interviewbit.com/java-interview-questions/
 */
class SampleThrowsThrow {
    public static int testExceptionDivide(int a, int b) throws ArithmeticException{
        if(a == 0 || b == 0)
            throw new ArithmeticException();
        return a/b;
    }
    public static void main(String args[]) {
        try{
            testExceptionDivide(10, 0);
        }
        catch(ArithmeticException e){
            //Handle the exception
        }
    }
}
