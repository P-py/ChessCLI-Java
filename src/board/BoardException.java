package board;

public class BoardException extends RuntimeException {
    private static final long serialVersionID = 1L;

    public void BoardException(String message){
        super(message);
    }
}