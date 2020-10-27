package dpij;

public interface iPlayer {
    Piece getPiece();
    Coord makeMove(iBoard board);
}
