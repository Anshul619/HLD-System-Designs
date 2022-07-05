package LLDProblems.ChessGame.domains;

import LLDProblems.ChessGame.domains.Abstract.Player;

public class ComputerPlayer extends Player {

    public ComputerPlayer(boolean whiteSide)
    {
        this.whiteSide = whiteSide;
        this.humanPlayer = false;
    }
}
