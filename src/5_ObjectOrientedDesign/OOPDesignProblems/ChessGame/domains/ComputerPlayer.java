package DesignLLDProblems.ChessGame.domains;

import DesignLLDProblems.ChessGame.domains.Abstract.Player;

public class ComputerPlayer extends Player {

    public ComputerPlayer(boolean whiteSide)
    {
        this.whiteSide = whiteSide;
        this.humanPlayer = false;
    }
}
