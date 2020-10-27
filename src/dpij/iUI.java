package dpij;

public interface iUI {
    void showBoard(iBoard board);
    Coord getInput(iBoard board);
    void showDraw();
    void showWinner(iPlayer player);
}
