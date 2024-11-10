import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] ticTacToe = new char[3][3];
        char ticTac = 0;
        for (int i = 0; i < 9; i++) {
            print2dArray(ticTacToe);
            if(i%2 == 0){
                ticTac = 'X';
            }else{
                ticTac = 'O';
            }
            System.out.println("Enter a row number");
            int rowNumber = scanner.nextInt();
            System.out.println("Enter a column number");
            int columnNumber = scanner.nextInt();
            ticTacToe[rowNumber][columnNumber] = ticTac;
            print2dArray(ticTacToe);
        }
        print2dArray(ticTacToe);
    }

    private static void print2dArray(char[][] ticTacToe) {
        for (int rows = 0; rows < ticTacToe.length; rows++) {
            for (int cols = 0; cols < ticTacToe[rows].length; cols++) {
                System.out.print(ticTacToe[rows][cols]);
                //System.out.print(rows + "," + cols + "  |  ");
            }
            System.out.println();
            System.out.println("---------------------------");
        }
    }
}
