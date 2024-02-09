import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public Board() {

    }

    public boolean validate(int x, int y) {
        return (x >= 1 && x <= 8) && (y >= 1 && y <= 8);
    }

    /**
     * add.
     * 
     * @param piece piece.
     */
    public void addPiece(Piece piece) {
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();
        if (validate(x, y) == true && getAt(x, y) == null) {
            pieces.add(piece);
        }
    }

    /**
     * get at.
     * 
     * @param x x.
     * @param y y.
     * @return position.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * remove.
     * 
     * @param x x.
     * @param y y.
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                break;
            }
        }
    }

}
