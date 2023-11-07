package DesignLLDProblems.ChessGame;

import DesignLLDProblems.ChessGame.domains.Abstract.Piece;
import DesignLLDProblems.ChessGame.domains.Abstract.Player;
import DesignLLDProblems.ChessGame.domains.Spot;

public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Spot start, Spot end)
    {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    public boolean isCastlingMove()
    {
        return this.castlingMove;
    }

    public void setCastlingMove(boolean castlingMove)
    {
        this.castlingMove = castlingMove;
    }

    public Spot getStart() {
        return start;
    }

    public Spot getEnd() {
        return end;
    }

    public void setPieceKilled(Piece destPiece) {
    }
}
