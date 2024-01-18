import java.util.Arrays;
import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        // 2-d arrays nothing but an array of arrays
        // below is the syntax for initialising a 2d array
        int[][] twodarray = new int[3][5];
        System.out.println(twodarray.length); // length returns the no. of rows in the 2d array
        // inputting a 2D array-----------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] array2d = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array2d[i][j] = input.nextInt();
            }
        }
    }    
}
