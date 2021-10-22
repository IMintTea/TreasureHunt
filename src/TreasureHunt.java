import java.util.Random;

public class TreasureHunt {

    int score = 0;

    public static void main(String[] args) {
        Random rd = new Random();

        String[][] board = new String[10][8];

        int treasure1 = rd.nextInt(10)+1;
        int treasure2 = rd.nextInt(10)+1;
        int treasure3 = rd.nextInt(10)+1;
        int treasure4 = rd.nextInt(10)+1;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[ ]";
                board[rd.nextInt(10)][rd.nextInt(8)] = "["+Integer.toString(treasure1)+"]";
                board[rd.nextInt(10)][rd.nextInt(8)] = "["+Integer.toString(treasure2)+"]";
                board[rd.nextInt(10)][rd.nextInt(8)] = "["+Integer.toString(treasure3)+"]";
                board[rd.nextInt(10)][rd.nextInt(8)] = "["+Integer.toString(treasure4)+"]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

    }
}
