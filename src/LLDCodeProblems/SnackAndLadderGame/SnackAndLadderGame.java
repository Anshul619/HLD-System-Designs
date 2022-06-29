package LLDCodeProblems.SnackAndLadderGame;

/**
 * Asked in Amazon, 29thJune2022
 *
 * To-Be-Completed
 */

/**
 * Problem Statement
 *
 * Create a snake and ladder game.
 * The game will have multiple snakes and ladders and there will be multiple people playing the game.
 * The game is played automatically based on basic game rules and ends when a player wins.
 *
 *
 99
 89
 .
 .
 29 28 27 26 25 24 23 22 21 20
 19 18 17 16 15 14 13 12 11 10
 0  1  2  3  4  5  6  7  8  9
 */

/**
 * LLD
 *
 * Classes
 * /*- MovableInterface - move
 * - Snack implements MovableInterface
 * -- move()
 * - Ladder implements MovableInterface
 * -- move()*/
 *-DiceEnum
         *--randomNumberLimit:6
         *-GameEnum
         *--winnerCondition:99
         *-PlotPosition
         *--type-snack or ladder
         *--start_position
         *--end_position
         *-Plot class
 *--static PlotPosition isSnackLadder(int position)
        *-User as a abstract class
 *--name
         *--last_moved
         *--password
         *-Winner class
 *--static isWinCondition()-if(position==GameEnum.winnerCondition){
        *return true;
        *}
        *-Player extend User
        *--int currentPostion
        *--int playerID
        *--constructor=>currentPostion=0,playerId
        *--inc(int input)-Change current position for the player(currentPostion+input).Return current position.
        *-PlayGame
        *--DiceEnum
        *--Queue<PlayerObject> playersQueue
        *--play()-DiceThrown
        *---get the current player"playerObj"from playersQueue(playersQueue.pop)
        *---find the random number from 1to max
        *---Plot.isSnackLadder()
        *---Based on the output,we will call playerObj.move(X)and get the position.
        *---Then we check Winner.isWinCondition(position).If win,return player.id.
        *---else Push"playerObj"and call play()
 */


public class PlayGame {

    Queue<PlayerObject> playersQueue = new LinkedInList();

    private void initializePlayersQueue(int numberOfPlayers) {

        playersQueue = new LinkedInList();
        // Define player

        for(int i=1; i < numberOfPlayers; i++) {
            playersQueue.add(new Player(i));
        }


    }

    PlayGame(int numberOfPlayers) {

        initializePlayersQueue(numberOfPlayers);
    }

    public void play(){

        boolean isGamePlaying = true;

        while(isGamePlaying) {

            Player currentPlayer = playersQueue.remove();

            int currentDice = Math.random(1, DiceEnum.randomNumberLimit);

            int position = currentPlayer.getCurrentPosition() + currentDice;

            PlotPosition plotPosition = Plot.isSnackLadder(position);

            currentPlayer.move(plotPosition.endPosition);

            if(Winner.isWinCondition(position)) {
                isGamePlaying = false;
            }
        }
    }

}



