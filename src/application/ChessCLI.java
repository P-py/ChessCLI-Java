package application;

import board.Board;
import chess.ChessMatch;

public class ChessCLI{
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}