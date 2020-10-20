package dpij;

public class HumanPlayer implements iPlayer {

    iUI ui;
    Piece piece;

    public HumanPlayer(iUI ui) {
        this.ui = ui;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    // TODO dependency?
    @Override
    public Coord makeMove() {
        return ui.getInput();
    }

    @Override
    public String toString() {
        return String.valueOf(piece.pieceChar);
    }
}
