package OtherLeetCodeProblems; /**
 * https://leetcode.com/problems/online-stock-span/submissions/
 *
 * More optimization possible - Instead of hashmap, we can use Queue with last 10 seconds messages only
 */

import java.util.Stack;

public class OnlineStockSpan901 {

    static class StockEntity {

        int price;
        int index;

        public StockEntity(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    private Stack<StockEntity> stack;

    private int lastCounter;


    public OnlineStockSpan901() {

        stack = new Stack<>();
        lastCounter = 0; // Zero-Based
    }

    public int next(int price) {

        lastCounter++;

        int currentPriceSpan = lastCounter;

        while (!stack.isEmpty() && price >= stack.peek().price) {
            stack.pop();
        }

        if (!stack.isEmpty()) {
            currentPriceSpan  = lastCounter - stack.peek().index;
        }

        StockEntity stock = new StockEntity(price, lastCounter);
        stack.push(stock);

        //System.out.println("stack ->" + stack);
        //System.out.println("currentPriceSpan ->" + currentPriceSpan);

        return currentPriceSpan;
    }

    public static void main(String[] args) {

        OnlineStockSpan901 obj = new OnlineStockSpan901();

        /*System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));*/

        /*System.out.println(obj.next(31));
        System.out.println(obj.next(41));
        System.out.println(obj.next(48));
        System.out.println(obj.next(59));
        System.out.println(obj.next(79));*/

        System.out.println(obj.next(28));
        System.out.println(obj.next(14));
        System.out.println(obj.next(28));
        System.out.println(obj.next(35));
        System.out.println(obj.next(46));
        System.out.println(obj.next(53));
        System.out.println(obj.next(66));
        System.out.println(obj.next(80));
        System.out.println(obj.next(87));
        System.out.println(obj.next(88));
    }
}
