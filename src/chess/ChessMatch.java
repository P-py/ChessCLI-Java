package chess;

import java.util.Scanner;

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
	private void placeNewPiece(char inputColumn, Integer inputRow, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(inputColumn, inputRow).toPosition());
	}
	private void initialSetup() {
		//testing
		
		//board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		//board.placePiece(new King(board, Color.BLACK), new Position(0, 1));
		//board.placePiece(new King(board, Color.BLACK), new Position(100, 100)); - must return a error with BoardException
		//board.placePiece(new King(board, Color.WHITE), new Position(0, 1)); must return error cause there is a piece already
		
		//placeNewPiece('a', 1, new King(board, Color.WHITE));
		//placeNewPiece('b', 2, new Rook(board, Color.WHITE));
		//placeNewPiece('c', 3, new King(board, Color.WHITE));
		//placeNewPiece('d', 4, new Rook(board, Color.WHITE));
		//placeNewPiece('e', 5, new King(board, Color.WHITE));
		//placeNewPiece('f', 6, new Rook(board, Color.WHITE));
		//placeNewPiece('g', 7, new King(board, Color.WHITE));
		//placeNewPiece('h', 8, new Rook(board, Color.WHITE));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nPlace a king or rook (k/r)?");
		String type = sc.nextLine();
		System.out.printf("\nPosition (a1 to h8)? ");
		String position = sc.nextLine();
		switch(type.toLowerCase()) {
			case "k":
				placeNewPiece(position.charAt(0), Integer.valueOf(position.substring(1)), new King(board, Color.WHITE));
				break;
			case "r":
				placeNewPiece(position.charAt(0), Integer.valueOf(position.charAt(1)), new Rook(board, Color.WHITE));
				break;
		}
	}
}