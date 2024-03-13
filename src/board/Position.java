package board;

public class Position {
	private Integer row;
	private Integer column;
	
	public Position() {	
	}
	public Position(Integer inputRow, Integer inputColumn) {
		this.row = inputRow;
		this.column = inputColumn;
	}
	public Integer getRow() {
		return this.row;
	}
	public Integer getColumn() {
		return this.column;
	}
	public void setRow(Integer inputRow) {
		this.row = inputRow;
	}
	public void setColumn(Integer inputColumn) {
		this.column = inputColumn;
	}
	public void setValues(Integer inputRow, Integer inputColumn) {
		this.row = inputRow;
		this.column = inputColumn;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("("+row);
		sb.append(", ");
		sb.append(column+")");
		return sb.toString();
	}
}
