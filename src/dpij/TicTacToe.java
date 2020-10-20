package dpij;

public class TicTacToe implements iTicTacToe {

    iBoard board;
    iUI ui;
    iRules rules;
    iPlayer player1;
    iPlayer player2;

    public TicTacToe() {
        board = new Board();
        ui = new UI();
        rules = new Rules();
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
    }

    @Override
    public void startGame() {

//        ui.askSize(board);
//
//        iPlayer currentPlayer = player2;
//
//        while (true) {
//
//            if (currentPlayer == player1) {
//                currentPlayer = player2;
//            } else {
//                currentPlayer = player1;
//            }
//
//            ui.showBoard(board);
//            currentPlayer.makeMove();
//
//            iPlayer status = rules.checkWinner(board);
//            if (status != null) {
//                break;
//            }
//
//        }
       ui.showBoard(board);

    }

}
