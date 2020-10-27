package dpij;

public class ComputerPlayer implements iPlayer {

    Piece piece;

    public ComputerPlayer() {
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    // TODO randomize moves
    @Override
    public Coord makeMove(iBoard board) {
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(piece.pieceChar);
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
