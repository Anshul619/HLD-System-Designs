package DesignLLDProblems.GenericCacheImpl;

import DesignLLDProblems.GenericCacheImpl.domains.Person;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GenericCacheImpl<K, V> {

    private HashMap<K, V> cacheMap;

    private Queue<K> cacheQueue;

    private int maxCapacity = 0;

    public GenericCacheImpl(int capacity) {
        cacheMap = new HashMap<>();
        cacheQueue = new LinkedList<>();
        maxCapacity = capacity;
    }

    private void addElementToQueue(K key) {

        if (cacheQueue.contains(key)) {
            cacheQueue.remove(key);
        }

        cacheQueue.add(key);

        if (cacheQueue.size() > maxCapacity) {
            Object itemToBeRemoved = cacheQueue.remove();
            cacheMap.remove(itemToBeRemoved);
        }
    }

    public V getItem(K key) {

        if (cacheMap.containsKey(key)) {
            addElementToQueue(key);
            return cacheMap.get(key);
        }

        return null;
    }

    public boolean addItem(K key, V value) {

        addElementToQueue(key);
        cacheMap.put(key, value);

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

        GenericCacheImpl<String, Person> cache = new GenericCacheImpl(3);

        /*cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        cache.getItem("9");
        cache.addItem("15", "E");
        cache.addItem("21", "E1");
        cache.addItem("5", "A1");
        cache.addItem(25, "F");*/

        cache.addItem("User1", new Person("Anshul"));
        Person personObj = cache.getItem("User1");

        System.out.println("Name ->" + personObj.getName());
        //cache.print();

        /*CacheImpl.CacheImpl cache = new CacheImpl.CacheImpl(2);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");

        cache.print();*/
    }

}
