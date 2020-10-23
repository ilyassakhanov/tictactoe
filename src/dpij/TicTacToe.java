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
            board.setPiece(currentPlayer.makeMove(), currentPlayer); // TODO getInput instead of makeMove?
            status = rules.checkWinner(board);
            //TODO connect UI to rules; make a method in rules that would check for collision of players in through top level logic
        }

    }

}
