package board;

public class Board{
    private Integer rows;
    private Integer columns;
    //matrix for the pieces in the board
    private Piece[][] pieces;

    public Board(Integer inputRows, Integer inputColumns){
    	this.rows = inputRows;
    	this.columns = inputColumns;
    	pieces = new Piece[inputRows][inputColumns];
    }
    public void setColumns(Integer inputColumns) {
    	this.columns = inputColumns;
    }
    public void setRows(Integer inputRows) {
    	this.rows = inputRows;
    }
    public Integer getRows() {
    	return this.rows;
    }
    public Integer getColumns() {
    	return this.columns;
    }
}