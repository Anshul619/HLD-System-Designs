package LLDProblems.ChessGame.domains;

import LLDProblems.ChessGame.domains.Abstract.Player;

public class HumanPlayer extends Player {

    public HumanPlayer(boolean whiteSide)
    {
        this.whiteSide = whiteSide;
        this.humanPlayer = true;
    }
}