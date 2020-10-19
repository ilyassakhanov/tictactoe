package dpij;

import java.util.ArrayList;

public class Board implements iBoard {
    //TODO multi-dimentional arrayList
    //ArrayList<iPlayer> arrBoard = new ArrayList();
    iPlayer[][] arrBoard = new iPlayer[3][3];

    @Override
    public void setPiece(Coord coord, iPlayer player) {
        arrBoard[coord.x][coord.y] = player;
    }

    @Override
    public iPlayer getPiece(Coord coord) {
        return arrBoard[coord.x][coord.y];
    }

    @Override
    public boolean isFull() {
        for (int x = 0; x < arrBoard.length; x++) {
            for (int y = 0; y < arrBoard[x].length; y++) {
                if (arrBoard[x][y] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int getXSize() {
        return arrBoard.length;
    }
}

