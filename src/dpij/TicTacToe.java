package dpij;

public class TicTacToe {

    iBoard board;
    iUI ui;
    iRules rules;
    iPlayer player1;
    iPlayer player2;

    public TicTacToe(iPlayer player1, iPlayer player2) {
        board = new Board();
        ui = new UI();
        rules = new Rules();
        this.player1 = player1;
        this.player2 = player2;
    }

    void startGame() {
        iPlayer currentPlayer = player2;
        do {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            ui.showBoard(board);
            currentPlayer.makeMove();

        } while (!rules.isGameFinished(board));
    }

}
