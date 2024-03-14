package chess;

import board.Board;
import board.Piece;

public class ChessPiece extends Piece{
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Board inputBoard, Color inputColor) {
		super(inputBoard);
		this.color = inputColor;
	}
	public Color getColor() {
		return color;
	}
}