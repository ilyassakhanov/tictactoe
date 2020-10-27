package dpij;

public class Rules implements iRules {
    //TODO Reimplement the logic of all methods with Rules 2
    @Override
    public iPlayer checkWinner(iBoard board) {
        //  new player (for draw)
        iPlayer winner = null;
        if (board.isFull()) {
            return new HumanPlayer(new UI(), new Piece('█'));
        }
        if (checkDiagonal(board) != null) {
            winner = checkDiagonal(board);
        } else if (checkVert(board) != null) {
            winner = checkVert(board);
        }
        return winner;
    }

    public iPlayer checkDiagonal(iBoard board) {
        iPlayer player = null;
        Coord coord = new Coord();
        // check from top left to bottom right
        for (int i = 0; i < board.getXSize(); i++) {
            coord.x = i;
            coord.y = i;
            // break loop if there is no piece
            if (board.getPiece(coord) == null) {
                break;
            } else {
                // break loop if the diagonal has different players or no piece
                // if it is the initial check, do not not break loop
                if (board.getPiece(coord) != player) {
                    player = null;
                    break;
                }
                player = board.getPiece(coord);
            }
        }
        if (player == null) {
            // check from top right to bottom left
            for (int i = 0; i < board.getXSize(); i++) {
                coord.x = i;
                // starts from the board size and decreases to 0
                coord.y = board.getXSize() - i - 1;
                if (board.getPiece(coord) == null) {
                    break;
                } else {
                    if (board.getPiece(coord) != player && i != 0) {
                        player = null;
                        break;
                    }
                    player = board.getPiece(coord);
                }
            }
        }
        return player;
    }


    public iPlayer checkVert(iBoard board) {
        // Split to checkHoriz and checkVert
        iPlayer player = null;
        Coord coord = new Coord(); //TODO good design?
        for (int x = 0; x < board.getXSize(); x++) {
            coord.x = x;
            coord.y = 0;
            if (board.getPiece(coord) != null) {
                player = board.getPiece(coord);
                for (int y = 0; y < board.getXSize(); y++) {
                    coord.x = x;
                    coord.y = y;
                    if (board.getPiece(coord) != player) {
                        player = null;
                        break;
                    }
                }
            }
        }
        return player;
    }

    //TODO copypasted code, any way of preventing it?
    public iPlayer checkHoriz(iBoard board) {
        iPlayer player = null;
        Coord coord = new Coord();
        for (int y = 0; y < board.getXSize(); y++) {
            coord.x = 0;
            coord.y = y;
            if (board.getPiece(coord) != null) {
                player = board.getPiece(coord);
                for (int x = 0; x < board.getXSize(); x++) {
                    coord.x = x;
                    coord.y = y;
                    if (board.getPiece(coord) != player) {
                        player = null;
                        break;
                    }
                }

            }

        }
        return player;
    }
}
