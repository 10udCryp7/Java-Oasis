import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Board getBoard() {
        return board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Game(Board board) {
        this.board = board;
    }

    /**
     * move piece.
     * 
     * @param piece piece.
     * @param x     x.
     * @param y     y.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece != null) {
            if (piece.canMove(board, x, y) == true) {
                if (board.getAt(x, y) == null) {
                    moveHistory.add(new Move(piece.getCoordinatesX(), x,
                            piece.getCoordinatesY(), y, piece));
                } else {
                    moveHistory.add(new Move(piece.getCoordinatesX(), x,
                            piece.getCoordinatesY(), y, piece, board.getAt(x, y)));
                }
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
        }
    }
}
