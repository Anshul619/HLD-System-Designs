package DesignLLDProblems.GenericCacheImpl.others;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CacheImpl {

    private HashMap<String, String> cacheMap;

    private Queue<String> cacheQueue;

    private int maxCapacity = 0;

    public CacheImpl(int capacity) {
        cacheMap = new HashMap<>();
        cacheQueue = new LinkedList<>();
        maxCapacity = capacity;
    }

    private void addElementToQueue(String key) {

        if (cacheQueue.contains(key)) {
            cacheQueue.remove(key);
        }

        cacheQueue.add(key);

        if (cacheQueue.size() > maxCapacity) {
            String itemToBeRemoved = cacheQueue.remove();
            cacheMap.remove(itemToBeRemoved);
        }
    }

    public String getItem(String key) {

        if (cacheMap.containsKey(key)) {
            addElementToQueue(key);
            //print();
            return cacheMap.get(key);
        }

        return null;
    }

    public boolean addItem(String key, String value) {

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

        CacheImpl cache = new CacheImpl(3);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        cache.getItem("9");
        cache.addItem("15", "E");
        cache.addItem("21", "E1");
        cache.addItem("5", "A1");
        cache.addItem("25", "F");

        cache.print();

        /*CacheImpl.CacheImpl cache = new CacheImpl.CacheImpl(2);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");

        cache.print();*/
    }

}
