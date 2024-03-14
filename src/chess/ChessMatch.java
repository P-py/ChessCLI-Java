package chess;

import board.Board;

//chess rules
public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	//returns a matrix to the match
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		for (int rowIterator=0; rowIterator<board.getRows(); rowIterator++) {
			for (int columnIterator=0; columnIterator<board.getColumns(); columnIterator++) {
				matrix[rowIterator][columnIterator] = (ChessPiece) board.piece(rowIterator, columnIterator);
			}
		}
		return matrix;
	}
}