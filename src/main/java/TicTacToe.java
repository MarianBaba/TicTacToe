import java.util.Scanner;

public class TicTacToe {

    private static char[][] grid = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
         System.out.println("Enter cells: ");
         String input = scanner.nextLine();

         int index = 0;
         for(int i = 0; i < 3; i++) {
             for(int j = 0; j < 3; j++) {
                 if (input.charAt(index) == '_') {
                     grid[i][j] = ' ';
                 } else {
                     grid[i][j] = input.charAt(index);
                 }
                 index++;
             }
         }

         System.out.println("---------");

         for (int i = 0; i < 3; i++) {
             System.out.print("|");
             for(int j = 0; j < 3; j++) {
                 System.out.print(" " + grid[i][j]);
             }
             System.out.print(" |");
             System.out.println();
         }
         System.out.println("---------");
    }
}
