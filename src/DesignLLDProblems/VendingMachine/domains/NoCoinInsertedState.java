package LLDCodeProblems.VendingMachine.domains;

import LLDCodeProblems.VendingMachine.VendingMachine;

public class NoCoinInsertedState implements State{
    VendingMachine machine;
    public NoCoinInsertedState(VendingMachine machine) {
        this.machine =  machine;
    }
    public void insertCoin() throws MachineWarning{
        if (!machine.isEmpty()) {
            machine.setMachineState(machine.getConinInsertedState());
        }
        else {
            throw new MachineWarning("Can not process request .. Machine is out of stock");
        }
    }
    public void pressButton() throws MachineWarning{
        throw new MachineWarning("No coin inserted ..");
    }
    public void dispense() throws MachineWarning{
        throw new MachineWarning("Invalid Operation");
    }
}
