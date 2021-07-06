public class Pawn extends ChessPiece {

    Pawn(String color) {
        super(color);
    }


    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        }

        if (line == toLine) {
            return false;
        }
        if ((((toLine == line + 1) || ((line == 1) && (toLine == 3))) && ((toColumn == column)) && (getColor() == "White")) ||
                (((toLine == line - 1) || ((line == 6) && (toLine == 4))) && ((toColumn == column)) && (getColor() == "Black"))) {
            return true;
        }
        if ((column - toColumn == 1 || column - toColumn == -1) &&
                (line - toLine == 1 || line - toLine == -1) &&
                chessBoard.board[toLine][toColumn] != null) {
            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
        }

        return false;
    }

    public String getSymbol() {
        return "P";
    }
}
