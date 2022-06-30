package DesignComponents.EngineeringPrinciples.DesignPatterns.ObserverDesignPattern;

// A class to display score. Data of this class is
// updated by CricketData
class CurrentScoreDisplay {
    private int runs, wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + runs + "\nWickets:"
                + wickets + "\nOvers: " + overs);
    }
}
