import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        count -=2;
        int prevnum1 = 0;
        int prevnum2 = 1;
        int result;
        System.out.print(0+" "+1+" ");
        while (count!=0) {
            result = prevnum1+prevnum2; 
            prevnum1 = prevnum2;
            System.out.print(result+" ");
            prevnum2 = result;
            count--;
        }
        
    }
}
