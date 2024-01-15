import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("please enter the third number: ");
        int num3 = input.nextInt();
        int max = num1; // we assume the max number as the first number.
        if (num2>max) {
            max = num2;
        }
        else if(num3>max){
            max = num3;
        }
        System.out.println("the highest number is "+max);

    }
}
