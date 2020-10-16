package dpij;

public class Rules implements iRules{
    @Override
    public iPlayer checkWinner(iBoard board) {
        //TODO return: p1, p2, null, new player (for draw)
        return null;
    }

    @Override
    public boolean isGameFinished(iBoard board) {
        return false;
    }

    //TODO should we put this method in iRules? being common in any tictactoe?
    void checkDiagonal(iBoard board){

    }

    void checkHorizVert(iBoard board){

    }
}
