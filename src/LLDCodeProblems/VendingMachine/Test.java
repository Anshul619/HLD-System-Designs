package LLDCodeProblems.VendingMachine;

public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.reFill(2); //
        //First despense
        try {
            machine.insertCoin();
            machine.pressButton();
        } catch (MachineWarning e) {
            System.out.println("Test 1:" + e.getMessage());
        }
        //Second Test
        try {
            machine.insertCoin();
            machine.insertCoin();
            machine.pressButton();
        } catch (MachineWarning e) {
            System.out.println("Test 2:" + e.getMessage());
            try {
                machine.pressButton();
            } catch (MachineWarning f) {
                // TODO
            }
        }
        //Test THree
        try {
            machine.pressButton();
        } catch (MachineWarning e) {
            System.out.println("Test 3:" + e.getMessage());
        }
        //Test Four
        try {
            machine.insertCoin();
        } catch (MachineWarning e) {
            System.out.println("Test 4:" + e.getMessage());
        }
    }
}
