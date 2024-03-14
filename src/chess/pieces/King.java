package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	public King(Board inputBoard, Color inputColor) {
		super(inputBoard, inputColor);
	}
	@Override
	public String toString() {
		return "K";
	}
}
