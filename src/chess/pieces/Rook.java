package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{
	public Rook(Board inputBoard, Color inputColor) {
		super(inputBoard, inputColor);
	}
	@Override
	public String toString() {
		return "R";
	}
}