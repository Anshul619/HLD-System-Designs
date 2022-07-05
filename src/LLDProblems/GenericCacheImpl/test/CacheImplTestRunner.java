package LLDProblems.GenericCacheImpl.test;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class CacheImplTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CacheImplTestCase.class);

        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
