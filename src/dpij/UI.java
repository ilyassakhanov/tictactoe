package dpij;

import java.util.Scanner;

public class UI implements iUI {
    @Override
    public void showBoard(iBoard board) {
        Coord coord = new Coord();
        System.out.print("-");
        for (int i = 0; i < board.getXSize(); i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int x = 0; x < board.getXSize(); x++) {
            for (int y = 0; y < board.getXSize(); y++) {
                coord.x = x;
                coord.y = y;
                if (board.getPiece(coord) == null) { // TODO not taking any input
                    System.out.printf("|%s", " ");
                } else System.out.printf("|%s", board.getPiece(coord).toString());
            }
            System.out.print("|");
            System.out.println();
            System.out.print("-");
            for (int i = 0; i < board.getXSize(); i++) {
                System.out.print("--");
            }
            System.out.println();
        }
    }

    @Override
    public Coord getInput() { //TODO connect it to rules through top level logic; add a loop so player can retry inputting coordinates
        Scanner sc = new Scanner(System.in);
        Coord coord = new Coord();
        System.out.print("Enter the coordinate (ex: 1,2): ");
        String inputStr = sc.nextLine();
        if (inputStr.equals("exit")) {
            System.out.println("Bye!");
            System.exit(0);
        }
        try {
            String[] arrInput = inputStr.split(",");
            coord.x = Integer.parseInt(arrInput[0]) - 1;
            coord.y = Integer.parseInt(arrInput[1]) - 1;
            return coord;
        } catch (Exception e) {
            System.out.println("Something went wrong, try again");
            return null;
        }
    }

    @Override
    public void showDraw() {
        System.out.println("The game is draw!");
    }

    @Override
    public void showWinner(iPlayer winner) {
        System.out.println("Player " + winner.toString() + " is a winner!");
    }
}
