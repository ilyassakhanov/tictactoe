package dpij;

public interface iUI {
    void showBoard(iBoard board);
    Coord getInput();
    void showDraw();
    void showWinner(iPlayer player);
}
