// Imagine we are building an application that is used by many different customers. We want to avoid one customer being able to overload the system by sending too many requests, so we enforce a per-customer rate limit. The rate limit is defined as:
// “Each customer can make X requests per Y seconds”
	    
// Assuming that customer ID is extracted somehow from the request, implement the following function.
// Perform rate limiting logic for provided customer ID. Return true if the request is allowed, and false if it is not.

import java.util.*;

public class RequestsRateLimit {

    static class RequestsCountTime {
        public int count;
        public long firstRequestTimeInMilliSeconds;
        
        RequestsCountTime(int requestsCount, long nowInMilliSeconds) {
            this.count = requestsCount;
            this.firstRequestTimeInMilliSeconds = nowInMilliSeconds;
        }
        
    }
	
    HashMap<Integer, RequestsCountTime> currentRequests = new HashMap<Integer, RequestsCountTime>();
    
    int maxRequestsPerTimeBound = 0;
    int timeBound = 0;
    
    RequestsRateLimit(int requestsLimit, int timeBound) {
        this.maxRequestsPerTimeBound = requestsLimit;
        this.timeBound = timeBound;
    }
    
    boolean rateLimit(int customerId) {
        
        long nowInMilliSeconds = System.currentTimeMillis();
        
        //System.out.println("Get current time in milli seconds ->" + nowInMilliSeconds);
        
        if ( currentRequests.containsKey(customerId)) {
            RequestsCountTime requestCountObj = currentRequests.get(customerId);
            
            long secondsFromEpoch = (nowInMilliSeconds - requestCountObj.firstRequestTimeInMilliSeconds) / 1000;
            
            if (secondsFromEpoch <= timeBound && requestCountObj.count+1 <= maxRequestsPerTimeBound) {
                
                //RequestsCountTime requestsCountObj = new RequestsCountTime(1, requestCountObj.requestTime);
            
                //currentRequests.put(customerId, requestsCountObj);
                
                return true;
            }
            else {
                
                RequestsCountTime requestsCountObj = new RequestsCountTime(1, nowInMilliSeconds);
            
                currentRequests.put(customerId, requestsCountObj);
                
                return false;
            }
            
        }
        else {
            
            RequestsCountTime requestsCountObj = new RequestsCountTime(1, nowInMilliSeconds);
            
            currentRequests.put(customerId, requestsCountObj);
            
            return true;
        }
    }
        
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        RequestsRateLimit requestObj = new RequestsRateLimit(5, 2);
        
        System.out.println(requestObj.rateLimit(10));
        
    }

}
