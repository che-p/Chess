public class Horse extends ChessPiece {

    Horse(String color) {
        super(color);
    }


    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        if ((line == toLine) || (column == toColumn)) {
            return false;
        }

        if (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) {

            if (((toLine == line + 1 || toLine == line - 1) && ((toColumn == column + 2 || toColumn == column - 2)))
                    || (((toColumn == column + 1 || toColumn == column - 1) && ((toLine == line + 2 || toLine == line - 2))))) {
                return true;
            }
        }
        return false;
    }

    public String getSymbol() {
        return "H";
    }
}
