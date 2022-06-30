package DesignComponents.EngineeringPrinciples.DesignPatterns.AdapterDesignPattern.domains;

import DesignComponents.EngineeringPrinciples.DesignPatterns.AdapterDesignPattern.interfaces.ToyDuck;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
