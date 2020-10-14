package dpij;

public class Rules implements iRules{
    @Override
    public iPlayer checkWinner(iBoard board) {
        //TODO
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
