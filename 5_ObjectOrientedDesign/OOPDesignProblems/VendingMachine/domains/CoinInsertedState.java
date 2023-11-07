package LLDCodeProblems.VendingMachine.domains;

import LLDCodeProblems.VendingMachine.VendingMachine;

public class CoinInsertedState implements State{
    VendingMachine machine =null;
    public CoinInsertedState(VendingMachine machine) {
        this.machine =  machine;
    }
    public void insertCoin() throws MachineWarning{
        throw new MachineWarning("Coin is already inserted.");
    }
    public void dispense() throws MachineWarning{
        throw new MachineWarning("Dispense button is not pressed.");

    }
    public void pressButton() throws MachineWarning{
        machine.setMachineState(machine.getDispensingState());
    }
}
