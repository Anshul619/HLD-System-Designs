package LLDCodeProblems.VendingMachine;

import LLDCodeProblems.VendingMachine.domains.CoinInsertedState;
import LLDCodeProblems.VendingMachine.domains.DispensingState;
import LLDCodeProblems.VendingMachine.domains.EmptyState;
import LLDCodeProblems.VendingMachine.domains.NoCoinInsertedState;
import LLDCodeProblems.VendingMachine.domains.interfaces.State;

public class VendingMachine {
    State coninInsertedState = new CoinInsertedState(this);
    State emptyState = new EmptyState(this);
    State noCoinInsertedState = new NoCoinInsertedState(this);
    State dispensingState = new DispensingState(this);
    State machineState = null;
    int capacity = 0;
    public VendingMachine() {
        machineState = noCoinInsertedState;
    }
    public void reFill(int count) {
        capacity += count;
        machineState = noCoinInsertedState;
    }
    /**
     * Two Actions performed by MAchine
     */
    public void insertCoin() throws MachineWarning {
        machineState.insertCoin();
    }

    public void pressButton() throws MachineWarning {
        machineState.pressButton();
        machineState.dispense();
        capacity--;
    }

    public boolean isEmpty(){
        if(capacity<=0)
            return true;
        else
            return false;
    }

    public void setMachineState(State machineState) {
        this.machineState = machineState;
    }
    public State getMachineState() {
        return machineState;
    }
    public void setConinInsertedState(State coninInsertedState) {
        this.coninInsertedState = coninInsertedState;
    }
    public State getConinInsertedState() {
        return coninInsertedState;
    }
    public void setEmptyState(State emptyState) {
        this.emptyState = emptyState;
    }
    public State getEmptyState() {
        return emptyState;
    }
    public void setNoCoinInsertedState(State noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }
    public State getNoCoinInsertedState() {
        return noCoinInsertedState;
    }
    public void setDispensingState(State dispensingState) {
        this.dispensingState = dispensingState;
    }
    public State getDispensingState() {
        return dispensingState;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
}
