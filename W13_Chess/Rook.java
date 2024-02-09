public class Rook extends Piece {

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (board.validate(x, y) && (this.getCoordinatesX() == x || this.getCoordinatesY() == y)) {
            if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            } else {
                if (this.getCoordinatesX() == x) {
                    if (this.getCoordinatesY() > y) {
                        for (int i = y + 1; i <= this.getCoordinatesY() - 1; i++) {
                            if (board.getAt(x, i) != null) {
                                return false;
                            }
                        }
                    } else {
                        for (int i = this.getCoordinatesY() + 1; i <= y - 1; i++) {
                            if (board.getAt(x, i) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                } else if (this.getCoordinatesY() == y) {
                    if (this.getCoordinatesX() > x) {
                        for (int i = x + 1; i <= this.getCoordinatesX() - 1; i++) {
                            if (board.getAt(i, y) != null) {
                                return false;
                            }
                        }
                    } else {
                        for (int i = this.getCoordinatesX() + 1; i <= x - 1; i++) {
                            if (board.getAt(i, y) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
