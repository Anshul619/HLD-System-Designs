package DesignComponents.Java.Others;

/**
 * https://stackoverflow.com/questions/8798403/string-is-immutable-what-exactly-is-the-meaning#17942294
 *
 * - Storage area: In string, the String pool serves as the storage area. For StringBuilder and StringBuffer, heap memory is the storage area.
 * - Mutability: A String is immutable, whereas both the StringBuilder and StringBuffer are mutable.
 * - Efficiency: It is quite slow to work with a String. However, StringBuilder is the fastest in performing operations. The speed of a StringBuffer is more than a String and less than a StringBuilder. (For example appending a character is fastest in StringBuilder and very slow in String because a new memory is required for the new String with appended character.)
 * - Thread-safe: In the case of a threaded environment, StringBuilder and StringBuffer are used whereas a String is not used. However, StringBuilder is suitable for an environment with a single thread, and a StringBuffer is suitable for multiple threads.
 */
public class SampleStringBuilder {

    public static void main(String[] args) {

        // String, stored in String pool in Heap
        String first = "InterviewBit";

        first = "123";

        System.out.println(first); // New string object would be created in String pool in Heap

        String second = new String("InterviewBit");

        // StringBuffer - Heap storage
        StringBuffer third = new StringBuffer("InterviewBit");
        // StringBuilder - Heap storage
        StringBuilder fourth = new StringBuilder("InterviewBit");

    }
}
