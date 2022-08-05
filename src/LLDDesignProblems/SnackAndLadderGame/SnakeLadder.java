package DesignLLDProblems.SnackAndLadderGame;

import DesignLLDProblems.SnackAndLadderGame.domains.Board;
import DesignLLDProblems.SnackAndLadderGame.domains.User;

import java.util.*;

/**
 * Asked in Amazon, 29thJune2022
 *
 * Problem Statement
 * - Create a snake and ladder game.
 * - The game will have multiple snakes and ladders and there will be multiple people playing the game.
 * - The game is played automatically based on basic game rules and ends when a player wins.
 *
 * Reference
 * - https://leetcode.com/discuss/interview-question/object-oriented-design/1550957/Snake-and-Ladder-or-LLD
 * - https://www.geeksforgeeks.org/design-snake-game/?ref=lbp
 */

public class SnakeLadder {
    public Board board;
    List<User> users = new ArrayList<>();
    List<User> winnerList = new ArrayList<>();
    public void addUser(User newUser) {
        users.add(newUser);
    }

    public SnakeLadder(Board board, List<User> userList) {
        this.board = board;
        this.users = userList;
    }

    public int rollDice() {
        Random r = new Random();
        int value = r.nextInt(6) + 1;
        if (value == 6) {
            value += r.nextInt(6) + 1;
        }
        if (value == 12) {
            value += r.nextInt(6) + 1;
        }
        if (value == 18) {
            return 0;
        }
        return value;
    }

    public void play() {

        Queue<User> playersQueue = new LinkedList();

        for(int i=0; i < users.size(); i++) {
            playersQueue.add(users.get(i));
        }

        while(true) {

            User currentPlayer = playersQueue.remove();
            //System.out.println("Current player ->" + currentPlayer.name);

            int rollValue = rollDice();

            //System.out.println("Roll value ->" + rollValue);

            board.advanced(currentPlayer, rollValue);

            if (currentPlayer.position == board.winingPositon) {
                System.out.println("Winner ->" + currentPlayer.getName());
                return;
            }
            else {
                playersQueue.add(currentPlayer);
            }

            //System.out.println("--end--");
        }
    }


}