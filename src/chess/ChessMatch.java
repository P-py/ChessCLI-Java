package chess;

import board.Board;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//chess rules
public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	private void initialSetup() {
		//testing
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 1));
		//board.placePiece(new King(board, Color.BLACK), new Position(100, 100)); - must return a error with BoardException
		//board.placePiece(new King(board, Color.WHITE), new Position(0, 1)); must return error cause there is a piece already
	}
}