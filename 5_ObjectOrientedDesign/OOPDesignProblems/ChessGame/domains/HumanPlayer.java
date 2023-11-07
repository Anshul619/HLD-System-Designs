package DesignLLDProblems.ChessGame.domains;

import DesignLLDProblems.ChessGame.domains.Abstract.Player;

public class HumanPlayer extends Player {

    public HumanPlayer(boolean whiteSide)
    {
        this.whiteSide = whiteSide;
        this.humanPlayer = true;
    }
}