import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        // 2-d arrays are nothing but an array of arrays
        // below is the syntax for initializing a 2D array
        // int[][] twoDArray = new int[3][5];
        // System.out.println(twoDArray.length); // length returns the number of rows in the 2D array

        // Inputting a 2D array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] array2D = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = input.nextInt();
            }
        }

        // Outputting a 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // // Close the Scanner
        // input.close();
    }
}
