package dpij;

public class HumanPlayer implements iPlayer {

    iUI ui;
    Piece piece;

    public HumanPlayer(iUI ui, Piece piece) {
        this.ui = ui;
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    // TODO makeMove necessary in Player? getInput can go directly to TicTacToe
    @Override
    public Coord makeMove() {
        return ui.getInput();
    }

    @Override
    public String toString() {
        return String.valueOf(this.piece.pieceChar);

    }

    //TODO
    public void choosePiece(char pieceChar) {
        this.piece = new Piece(pieceChar);
    }
}
