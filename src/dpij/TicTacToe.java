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
        player1 = new HumanPlayer(ui);
        player2 = new ComputerPlayer(board);
        // TODO setPiece in HumanPlayer class but in the interface? (NullPointerException without setting the pieces)
    }

    @Override
    public void startGame() {

        iPlayer currentPlayer = player2;
        iPlayer status = null;

        while (status == null) {

            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

            ui.showBoard(board);
            board.setPiece(currentPlayer.makeMove(), currentPlayer);

            status = rules.checkWinner(board);

        }

    }

}
