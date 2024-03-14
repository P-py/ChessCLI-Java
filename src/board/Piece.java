package board;

public abstract class Piece{
    protected Position piecePosition;
    private Board board;
    
    public Piece() {
    }
    public Piece(Board inputBoard) {
    	this.board = inputBoard;
    	this.piecePosition = null;
    }
    
    //should only be accessible in the board package and subclasses from this package
    protected Board getBoard() {
    	return this.board;
    }
}