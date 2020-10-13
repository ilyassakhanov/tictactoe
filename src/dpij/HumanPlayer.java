package dpij;

public class HumanPlayer implements iPlayer {
    @Override
    public void getPiece() {

    }

    @Override
    public void makeMove() {
        UI ui = new UI();
        ui.getInput();
    }
}
