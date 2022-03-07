package tictactoe;
import java.util.*;

public class Main {
    public static int[] userInput = new int[2];
    public static String[][] list = new String[3][3];
    static int xInARow = 0;
    static int oInARow = 0;
    static int horizontalLine = 0;
    static int verticalLine = 0;
    static int diagonalLine = 0;
    static boolean xWins = false;
    static boolean oWins = false;
    static boolean draw = false;
    static boolean impossible = false;
    static boolean finish = false;
    static boolean playerX = true;
    static String symbol = " ";

    public static void main(String[] args) {
        loadGame();
        printGameGrid();
        while (!finish) {
            if (playerX) {
                symbol = "X";
            } else {
                symbol = "O";
            }
            loadScanner();
            printGameGrid();
            determineStatus();
            changePlayer();
        }
        printStatus();
    }

    public static void loadGame(String input) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                Character cha = input.charAt(i * list.length + j);
                list[i][j] = String.valueOf(cha);
            }
        }
    }
    public static void loadGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = " ";
            }
        }
    }
    public static void printEmptyGameGrid() {
        System.out.println();
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");
    }
    public static void printGameGrid() {
        System.out.println();
        System.out.println("---------");
        System.out.println("|" + " " + list[0][0] + " " + list[0][1] + " " + list[0][2] + " |");
        System.out.println("|" + " " + list[1][0] + " " + list[1][1] + " " + list[1][2] + " |");
        System.out.println("|" + " " + list[2][0] + " " + list[2][1] + " " + list[2][2] + " |");
        System.out.println("---------");
    }

    public static boolean checkLine() {
        if (!list[1][1].equals(" ") && (list[0][0].equals(list[1][1]) && list[1][1].equals(list[2][2])) || !list[1][1].equals(" ") && (list[0][2].equals(list[1][1]) && list[1][1].equals(list[2][0]))) {
            diagonalLine++;
            if (list[1][1].equals("O")) {
                oInARow++;
                finish = true;
            }
            else if (list[1][1].equals("X")) {
                xInARow++;
                finish = true;
            }
        }
//          check horizontal line
        for (int i = 0; i < 3; i++) {
            if (!list[i][0].equals(" ") && (list[i][0].equals(list[i][1])) && (list[i][1].equals(list[i][2]))) {
                if (list[i][0].equals("O")) {
                    oInARow++;
                    horizontalLine++;
                    finish = true;
                    break;
                } else if (list[i][0].equals("X")) {
                    xInARow++;
                    horizontalLine++;
                    finish = true;
                    break;
                }
                break;
            }
        }
//            check vertical line
        for (int j = 0; j < 3; j++) {
            if (!list[0][j].equals(" ") && (list[0][j].equals(list[1][j])) && (list[1][j].equals(list[2][j]))) {
                if (list[0][j].equals("O")) {
                    verticalLine++;
                    oInARow++;
                    finish = true;
                    break;
                } else if (list[0][j].equals("X")) {
                    verticalLine++;
                    xInARow++;
                    finish = true;
                    break;
                }
                break;
            }
        }
        System.out.println("x rows: " + xInARow);
        System.out.println("o rows: " + oInARow);
        System.out.println("horizontal Line:" + horizontalLine);
        System.out.println("vertical Line:" + verticalLine);
        System.out.println("diagonal Line:" + diagonalLine);
        return finish;
    }

    public static void setCoordinate(String[][] list, int[] userInput) {
        int rowCoord = userInput[0] - 1;
        int columnCoord = userInput[1] - 1;
        if (!list[rowCoord][columnCoord].equals(" ")) {
            System.out.println("This cell is occupied! Choose another one!");
            loadScanner();
        } else {
            list[rowCoord][columnCoord] = symbol;
            System.out.println(userInput[0] + "," + userInput[1] + " is set to " + symbol);
        }
    }

    public static void determineStatus() {
        checkLine();
//        determine status
        if (oInARow == 1 && xInARow == 0) {
            oWins = true;
            finish = true;
        } else if (oInARow == 0 && xInARow == 1) {
            xWins = true;
            finish = true;
        } else if (oInARow > xInARow) {
            oWins = true;
            finish = true;
        } else if (xInARow > oInARow) {
            xWins = true;
            finish = true;
        } else if (countDifference(list) >= 2) {
            impossible = true;
            finish = true;
        } if (!hasEmptyCell(list)) {
            draw = true;
            finish = true;
        }
    }

    public static void changePlayer() {
        if (!finish) {
            playerX = !playerX;
        }
    }

    public static void printStatus() {
        if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (!finish) {
            System.out.println("Game not finished");
        } else if (draw) {
            System.out.println("Draw");
        } else if (impossible) {
            System.out.println("Impossible");
        }
    }

    public static int countDifference(String[][] list) {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j].equals("O")) {
                    oCount++;
                }
                if (list[i][j].equals("X")) {
                    xCount++;
                }
            }
        }
        return Math.abs(xCount - oCount);
    }

    public static boolean hasEmptyCell(String[][] list) {
        boolean emptyCell = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i][j].equals(" ")) {
                    emptyCell = true;
                    break;
                }
            }
        }
        return emptyCell;
    }

    public static void loadScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates:");
//        try {
        userInput[0] = scanner.nextInt();
        userInput[1] = scanner.nextInt();
        if (userInput[0] > 3 || userInput[0] < 1 || userInput[1] > 3 || userInput[1] < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            loadScanner();
        } else {
            setCoordinate(list, userInput);
        }
//        } catch (Exception e) {
//            System.out.println("You should enter numbers!");
//            loadScanner();
//        }
    }
}
