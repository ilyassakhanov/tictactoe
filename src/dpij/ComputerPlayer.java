package dpij;

public class ComputerPlayer implements iPlayer{

    iBoard board;
    Piece piece;

    public ComputerPlayer(iBoard board) {
        this.board = board;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    // TODO randomize moves
    @Override
    public Coord makeMove() {
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(piece.pieceChar);
    }
}
