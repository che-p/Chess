abstract class ChessPiece {
    String color;
    boolean check = true;

    ChessPiece(String color) {
        this.color = color;
    }

    abstract public String getColor();

    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract public String getSymbol();

    protected boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    protected int getMax(int a, int b) {
        return Math.max(a, b);
    }

    protected int getMin(int a, int b) {
        return Math.min(a, b);
    }

}
