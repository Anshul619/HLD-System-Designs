package Java.MemoryAllocation;

/**
 * Stack
 * - Allocated per Thread
 * - Stores local references and primitives
 * - This is scoped memory - When a method or thread ends, all their data in the stack is lost
 * - Has the fastest access, so a local primitive is faster to use than a local Object
 * - And it was fixed.
 *
 * Heap
 * - All allocated object instances exist here
 * - Divided into Generations, with the youngest generation being the first place GC looks
 * - Available to all threads so allocations and de-allocations should be synchronised
 * - This memory can become fragmented (but you do not usually manage this yourself)
 * - *Garbage Collection* - When heap is full, garbage is collected.
 * - Heap memory is the portion that was not allocated to the java program but it will be available for use by the java program when it is required, mostly during the runtime of the program.
 *
 * Heap Area
 * - Young generation - for objects
 * - Survivor space
 * - Old generation
 * - Permanent generation ( non-heap ) - for classes definition, static variables etc.
 * - Code Cache ( non-heap )
 *
 * Metaspace/PermGen in Heap
 * - Stores loaded class information
 * - Stores immutable information (Primitives, interned Strings)
 * - Stores static class members
 *
 * References
 * - https://stackoverflow.com/questions/6801676/heap-vs-stack-vs-perm-space
 * - https://www.interviewbit.com/java-interview-questions/
 */
public class SimpleVal { //The Class (loaded by a classloader) is in the PermGen

    private static final int MAGIC_CONSTANT = 42; //Static fields are stored in PermGen
    private static final SimpleVal INSTANCE = new SimpleVal(1); //Static field objects are created in the heap normally, with the reference in the PermGen ('class statics' moved to the heap from Java 7+)
    private static SimpleVal previousInstance; //Mutable static fields also have their reference in PermGen so they can easily cause memory leaks

    private int value; // Member/Instance variables will be part of the heap

    public SimpleVal(int realValue) {
        value = realValue; // Local variable in Stack
    }

    public static int subtract(SimpleVal val1, SimpleVal val2) {
        return 0;
    }

    public int add(SimpleVal other) { // Only one copy of any method (static or not) exists in PermGen
        int sum = value + other.value; // Local values in methods are placed in the Stack memory
        return sum;
    }

    public static void main(String[] args) {

        SimpleVal val1 = null;
        SimpleVal val2 = new SimpleVal(3); //Both of these variables (references) are stored in the Stack

        val1 = new SimpleVal(14); //The actual objects we create and add to the variables are placed in the Heap (app global memory, initially in the Young Gen space and later moved to old generation, unless they are very large they can immediately go old gen)

        int prim = val1.add(val2); //primitive value is stored directly in the Stack memory
        Integer boxed = new Integer(prim); //but the boxed object will be in the heap (with a reference (variable) in the Stack)

        String message = "The output is: "; // IMPORTANT - In Java 7+ the string is created in the heap ( String Pool ), in 6 and below it is created in the PermGen
        System.out.println(message + prim);

    }
}