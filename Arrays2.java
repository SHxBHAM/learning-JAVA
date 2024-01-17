import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        // now lets try to loop on an array for taking inputs and outputting elements individually
        int[] myArr = new int[5]; //initialises an array of size 5

        Scanner input = new Scanner(System.in);

        for(int i=0;i<myArr.length;i++){
            myArr[i] = input.nextInt(); // for loop for pushing values into our array
        }
        //for(int i=0;i<myArr.length;i++){
        //     System.out.print(myArr[i]+" ");// for loop for printing values of our array
        //}
        // another method could be someting like the one below called for each
         for (int i : myArr) { //here 'i' represents the element of the array 
            System.out.println(i);
         }
    }
}
