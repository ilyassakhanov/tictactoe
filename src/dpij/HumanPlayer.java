package dpij;

public class HumanPlayer implements iPlayer {
    @Override
    public char getPiece() {

        return 'x';
    }

    @Override
    public void makeMove() {
        UI ui = new UI();
        ui.getInput();
    }
}
