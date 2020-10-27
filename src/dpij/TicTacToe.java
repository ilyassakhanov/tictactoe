package dpij;

public class TicTacToe implements iTicTacToe {

    iBoard board;
    iUI ui;
    iRules rules;
    iPlayer player1;
    iPlayer player2;

    public TicTacToe() {
        board = new Board(3);
        ui = new UI();
        rules = new Rules();
        player1 = new HumanPlayer(ui, new Piece('x'));
        player2 = new HumanPlayer(ui, new Piece('o'));
    }

    @Override
    public void startGame() {

        iPlayer currentPlayer = player2;
        iPlayer status = null;

        while (status == null) {
            //TODO where to set pieces?
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            ui.showBoard(board);
            board.setPiece(currentPlayer.makeMove(board), currentPlayer); // TODO getInput instead of makeMove?
            status = rules.checkWinner(board);
        }
        ui.showBoard(board);
        if(status.getPiece().equals('█')){
            ui.showDraw();
        }else ui.showWinner(status);

    }

}
