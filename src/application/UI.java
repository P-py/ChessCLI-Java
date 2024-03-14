package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		String alphabetVector[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", 
								   "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		for (int rowIterator=0; rowIterator<pieces.length; rowIterator++) {
			System.out.printf("%d ", pieces.length-rowIterator);
			for (int columnIterator=0; columnIterator<pieces.length; columnIterator++) {
				printPiece(pieces[rowIterator][columnIterator]);
			}
			System.out.printf("\n");
		}
		System.out.print("  ");
		for (int columnIterator=0; columnIterator<pieces.length; columnIterator++) {
			System.out.printf("%s ", alphabetVector[columnIterator]);
		}
		System.out.printf("\n");
	}
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.printf("-"+" ");
		}
		else {
			System.out.print(piece+" ");
		}
	}
} 