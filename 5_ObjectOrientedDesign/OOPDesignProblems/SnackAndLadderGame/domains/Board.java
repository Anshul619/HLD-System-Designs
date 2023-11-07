package DesignLLDProblems.SnackAndLadderGame.domains;

import java.util.HashMap;
import java.util.Map;

public class Board {
    int grid;
    Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer,Integer> ladder = new HashMap<>();
    public int winingPositon;
    public void addSnake(int head, int tail){
        snake.put(head,tail);
    }
    public void addLadder(int start, int end){
        ladder.put(start,end);
    }
    void setWiningPositon(int positon) {
        winingPositon =  positon;
    }
    void setGrid(int size) {
        grid = size;
    }
    public Board() {
        grid = 100;
        winingPositon = 100; // Can be set using setter
    }
    public void advanced( User user, int value){
        if(user.position + value > grid){
            return;
        }
        user.position += value;
        if (snake.get(user.position) != null ){
            System.out.println(" "+ user.name+ " Bit By snake LOL!!");
            user.position = snake.get(user.position);
        }
        if (ladder.get(user.position) != null ){
            System.out.println(" "+ user.name+" Got ladder Haha :)");
            user.position = ladder.get(user.position);
        }
    }

}

