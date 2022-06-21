package CodeProblems.LeetCodeProblems;

import java.util.*;

public class LRUCache146 {
	
	HashMap<Integer, Integer> lruMap = new HashMap<Integer, Integer>();
    Queue<Integer> lruQueue = new LinkedList<Integer>();
    
    int lruMaxCapacity = 0;
    
    public LRUCache146(int capacity) {
        lruMaxCapacity = capacity;
    }
    
    private void addToLRUQueue(int key) {
    	
    	if (lruQueue.contains(key)) { // Update key in Queue
    		lruQueue.remove(key);
    		lruQueue.add(key);
    		return;
    	}
    	
        if (lruQueue.size() == lruMaxCapacity) {
        	lruQueue.remove();
        }
        
        lruQueue.add(key);
    }
    
    public int get(int key) {
        
        if (lruMap.containsKey(key)) {
            addToLRUQueue(key);
            print();
            return lruMap.get(key);
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        
    	if (lruMap.containsKey(key)) { // Update key in LRU Cache
    		addToLRUQueue(key);
            lruMap.put(key, value);
            
            print();
            
            return;
    	}
    	
    	if (lruMap.size() == lruMaxCapacity) { // LRU cache is already full
            int leastRecentlyUsedKey = lruQueue.remove();
            lruMap.remove(leastRecentlyUsedKey);
        }
        
    	addToLRUQueue(key);
        lruMap.put(key, value);
        
        print();
    }
    
    public void print() {
    	System.out.println("----");
    	System.out.println("lruQueue -> " + lruQueue);
    	System.out.println("lruMap -> " + lruMap);
    	System.out.println("Head of the queue ->" + lruQueue.peek());
    	System.out.println("----");
    }

	public static void main(String args[]) {
		// Your code goes here

		//System.out.println("Hello World!");
        
		/*LeetCodeProblems.LRUCache146 lRUCache = new LeetCodeProblems.LRUCache146(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.get(1);    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.get(2);    // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		lRUCache.get(1);    // return -1 (not found)
		lRUCache.get(3);    // return 3
		lRUCache.get(4);    // return 4*/
		
		LRUCache146 lRUCache = new LRUCache146(2); //null
		lRUCache.get(2);    // -1
		lRUCache.put(2, 6); // null
		lRUCache.get(1);    // -1
		lRUCache.put(1, 5); // null
		lRUCache.put(1, 2); // null
		lRUCache.get(1);    // 2
		lRUCache.get(2);    // 6
		
		/*LeetCodeProblems.LRUCache146 obj = new LeetCodeProblems.LRUCache146(2);
        
        obj.put(1, 10);
        obj.put(2, 20);
        obj.put(3, 30);
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        //System.out.println(obj.get(3));
        //System.out.println(obj.get(2));*/
        
        
        //obj.print();
	}

}
