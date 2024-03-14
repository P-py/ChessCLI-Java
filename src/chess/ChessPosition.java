package chess;

import board.Position;

public class ChessPosition {
	private char column;
	private Integer row;
	
	public ChessPosition(char inputColumn, Integer inputRow) {
		if (inputColumn<'a'||inputColumn>'h'||inputRow<1||inputRow>8) {
			throw new ChessException("Error creating chess position: values must be between a1 to h8");
		}
		this.column = inputColumn;
		this.row = inputRow;
	}
	public char getColumn() {
		return this.column;
	}
	public Integer getRow() {
		return this.row;
	}
	//matrix_row = 8 - chess_row
	//a = 0
	//b = 1
	//c = 2
	//...
	//'a' - 'a' = 0
	//'b' - 'a' = 1
	//matrix_column = chess_column - 'a'
	protected Position toPosition() {
		 return new Position(8-row, column-'a');
	}
	protected static ChessPosition fromPosition(Position inputPos) {
		return new ChessPosition((char)('a'-inputPos.getColumn()), 8-inputPos.getRow());
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(column+row);
		return sb.toString();
	}
}
