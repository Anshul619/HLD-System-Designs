package LLDCodeProblems.LeetCodeProblems;

/**
 * https://leetcode.com/problems/design-parking-system/submissions/
 */

public class ParkingSystemImpl1603 {

    private int availableBigSlots;
    private int availableMediumSlots;
    private int availableSmallSlots;

    public ParkingSystemImpl1603(int big, int medium, int small) {

        availableBigSlots = big;
        availableMediumSlots = medium;
        availableSmallSlots= small;
    }

    public boolean addCar(int carType) {

        switch (carType) {
            case 1: // big
                if (availableBigSlots == 0) {
                    return false;
                }
                availableBigSlots--;
                break;
            case 2: // medium
                if (availableMediumSlots == 0) {
                    return false;
                }
                availableMediumSlots--;
                break;
            case 3: // small
                if (availableSmallSlots == 0) {
                    return false;
                }
                availableSmallSlots--;
                break;
            default:
                //Nothing
        }

        return true;
    }

    public static void main(String[] args) {

        ParkingSystemImpl1603 obj = new ParkingSystemImpl1603(1, 1, 0);

        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }
}
