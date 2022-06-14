package OtherLeetCodeProblems;

/**
 * https://www.baeldung.com/java-stack-heap
 * https://stackoverflow.com/questions/6569557/what-is-the-actual-memory-place-for-static-variables
 * https://stackoverflow.com/questions/6801676/heap-vs-stack-vs-perm-space
 *
 * Stack
 * - Allocated per Thread
 * - Stores local references and primitives
 * - This is scoped memory - When a method or thread ends, all their data in the stack is lost
 * - Has the fastest access, so a local primitive is faster to use than a local Object
 *
 * Heap
 * - All allocated object instances exist here
 * - Divided into Generations, with the youngest generation being the first place GC looks
 * - Available to all threads so allocations and deallocations should be synchronised
 * - This memory can become fragmented (but you do not usually manage this yourself)
 *
 * PermGen
 * - Stores loaded class information
 * - Stores immutable information (Primatives, interned Strings)
 * - Stores static class members
 *
 */
public class JavaMemoryAllocationExample {
}

/*static class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

static public class PersonBuilder {
    private static Person buildPerson(int id, String name) {
        return new Person(id, name);
    }
    
    // a space in stack memory is created to store primitives and references of this method.
    public static void main(String[] args) {
        int id = 23; // Stack memory directly stores the primitive value of integer id.
        String name = "John"; // Stack memory
        Person person = null; // The reference variable person of type Person will also be created in stack memory, which will point to the actual object in the heap.
        person = buildPerson(id, name); // The call to the parameterized constructor Person(int, String) from main() will allocate further memory on top of the previous stack.
    }

    // PermGen Memory - Code Segment — the segment where the actual compiled Java bytecodes resides when loaded. Static members (variables or methods) are called class members, meaning they reside where the class (bytecode) resides, which is in the Code Segment.
    static int a=0;
}*/
