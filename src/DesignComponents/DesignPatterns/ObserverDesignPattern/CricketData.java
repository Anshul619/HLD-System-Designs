package DesignComponents.DesignPatterns.ObserverDesignPattern;

// Java implementation of above design for Cricket App. The
// problems with this design are discussed below.

// A class that gets information from stadium and notifies
// display elements, CurrentScoreDisplay & AverageScoreDisplay
class CricketData
{
    int runs, wickets;
    float overs;
    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    // Constructor
    public CricketData(CurrentScoreDisplay currentScoreDisplay,
                       AverageScoreDisplay averageScoreDisplay)
    {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    // Get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 90;
    }

    // Get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }

    // Get latest overs from stadium
    private float getLatestOvers()
    {
        // return 10.2 for simplicity
        return (float)10.2;
    }

    // This method is used update displays when data changes
    public void dataChanged()
    {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }
}

