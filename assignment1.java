import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num%2 == 0) {
            System.out.println("The input num "+num+" is even");
        }
        else{
            System.out.println("The input num "+num+" is odd");
        }
    }
}
