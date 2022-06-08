package CacheImpl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CacheObjImpl {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
    private HashMap<Object, Object> cacheMap;

    private Queue<Object> cacheQueue;

    private int maxCapacity = 0;

    public CacheObjImpl(int capacity) {
        cacheMap = new HashMap<>();
        cacheQueue = new LinkedList<>();
        maxCapacity = capacity;
    }

    private void addElementToQueue(Object key) {

        if (cacheQueue.contains(key)) {
            cacheQueue.remove(key);
        }

        cacheQueue.add(key);

        if (cacheQueue.size() > maxCapacity) {
            Object itemToBeRemoved = cacheQueue.remove();
            cacheMap.remove(itemToBeRemoved);
        }
    }

    public Object getItem(Object key) {

        if (cacheMap.containsKey(key)) {
            addElementToQueue(key);
            //print();
            return cacheMap.get(key);
        }

        return null;
    }

    public boolean addItem(Object key, Object value) {

        addElementToQueue(key);
        cacheMap.put(key, value);

        //print();
        return true;
    }

    public void print(){
        System.out.println(cacheMap);
        System.out.println(cacheQueue);
    }

    public static void main(String[] args) {

        /*CacheImpl.CacheImpl cache = new CacheImpl.CacheImpl(5);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        cache.addItem("15", "E");
        cache.addItem("5", "A1");
        cache.addItem("25", "F");*/

        CacheObjImpl cache = new CacheObjImpl(3);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        cache.getItem("9");
        cache.addItem("15", "E");
        cache.addItem("21", "E1");
        cache.addItem("5", "A1");
        cache.addItem(25, "F");

        cache.addItem("User1", new Person("Anshul"));
        Object personObj = cache.getItem("User1");

        //HashMap<String, Person> map = new HashMap<>();

        System.out.println("Name ->" + personObj.getClass().getName());
        cache.print();

        /*CacheImpl.CacheImpl cache = new CacheImpl.CacheImpl(2);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");

        cache.print();*/
    }

}
