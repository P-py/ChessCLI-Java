package board;

public class Board{
    private Integer rows;
    private Integer columns;
    //matrix for the pieces in the board
    private Piece[][] pieces;

    public Board(Integer inputRows, Integer inputColumns){
    	if (inputRows<1||inputColumns<1) {
    		throw new BoardException("Error in board creation: Board rows and columns must be at least 1.");
    	}
    	this.rows = inputRows;
    	this.columns = inputColumns;
    	pieces = new Piece[inputRows][inputColumns];
    }
    public Integer getRows() {
    	return this.rows;
    }
    public Integer getColumns() {
    	return this.columns;
    }
    //returns a piece based on row and column individually
    public Piece piece(Integer inputRows, Integer inputColumns) {
    	if (!positionExists(inputRows, inputColumns)) {
    		throw new BoardException("Error in piece search: position does not exist in the board.");
    	}
    	return pieces[inputRows][inputColumns];
    }
    //returns a piece based on a position object
    public Piece piece(Position inputPos) {
    	if (!positionExists(inputPos)) {
    		throw new BoardException("Error in piece search: position does not exist in the board.");
    	}
    	return pieces[inputPos.getRow()][inputPos.getColumn()];
    }
    public void placePiece(Piece inputPiece, Position inputPos) {
    	if (thereIsAPiece(inputPos)) {
    		throw new BoardException("Error placing piece: position already occupied by a piece.");
    	}
    	pieces[inputPos.getRow()][inputPos.getColumn()] = inputPiece;
    	inputPiece.piecePosition = inputPos;
    }
    private Boolean positionExists(Integer inputRow, Integer inputColumn) {
    	return ((inputRow>=0&&inputRow<this.rows)&&(inputColumn>=0&&inputColumn<this.columns));
    }
    public Boolean positionExists(Position inputPos) {
    	return positionExists(inputPos.getRow(), inputPos.getColumn());
    }
    public Boolean thereIsAPiece(Position inputPos) {
    	if (!positionExists(inputPos)) {
    		throw new BoardException("Error in piece search: position does not exist in the board.");
    	}
    	//null stands for "-" in the UI
    	//and no piece in position for the game
    	return piece(inputPos)!=null;
    }
}