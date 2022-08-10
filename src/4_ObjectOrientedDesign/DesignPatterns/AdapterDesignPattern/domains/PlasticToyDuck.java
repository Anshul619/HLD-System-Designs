package DesignComponents.DesignPatterns.AdapterDesignPattern.domains;

import DesignComponents.DesignPatterns.AdapterDesignPattern.interfaces.ToyDuck;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
