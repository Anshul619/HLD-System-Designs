package DesignComponents.DesignPatterns.AdapterDesignPattern;

import DesignComponents.DesignPatterns.AdapterDesignPattern.interfaces.ToyDuck;
import DesignComponents.DesignPatterns.AdapterDesignPattern.domains.PlasticToyDuck;
import DesignComponents.DesignPatterns.AdapterDesignPattern.domains.Sparrow;

class Main
{
    public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap a bird in a birdAdapter so that it behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
