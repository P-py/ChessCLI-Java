package application;

import board.Board;
import chess.ChessMatch;
import chess.Color;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessCLI{
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}