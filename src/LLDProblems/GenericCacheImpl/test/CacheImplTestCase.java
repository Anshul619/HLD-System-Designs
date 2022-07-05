package LLDProblems.GenericCacheImpl.test;

import LLDProblems.GenericCacheImpl.others.CacheImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CacheImplTestCase {

    @Test
    public void test_Normal() {
        CacheImpl cache = new CacheImpl(3);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        String item = cache.getItem("5");
        assertEquals(item, "A");
    }

    @Test
    public void test_DuplicateInsertion() {

        CacheImpl cache = new CacheImpl(3);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.getItem("5");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        String item = cache.getItem("5");
        assertEquals(item, "A");
    }

    @Test
    public void test_CacheCapacityCheck() {

        CacheImpl cache = new CacheImpl(3);

        cache.addItem("5", "A");
        cache.addItem("7", "B");
        cache.addItem("9", "C");
        cache.addItem("10", "D");
        String item = cache.getItem("5");
        assertEquals(item, null);
    }

    @Test
    public void test_ZeroCacheCapacity() {

        CacheImpl cache = new CacheImpl(0);

        cache.addItem("5", "A");
        String item = cache.getItem("5");
        assertEquals(item, null);
    }
}
