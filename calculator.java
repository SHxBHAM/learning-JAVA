import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        int ans = 0;
        int num1;
        int num2;
        System.out.println("------CALCULATOR------");

        while (true) {
            System.out.print("please enter the operator");
            operator = input.next().trim().charAt(0);// trim removes the white spaces and charAt takes the char at the passed index in this case 0
            if (operator=='x'||operator=='X') {
                break;
            }
            System.out.print("please enter 2 number :");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if (operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%') {
                if (operator=='+') {
                    ans = num1 + num2;
                }
                else if (operator=='-') {
                    ans = num1 - num2;
                }
                else if (operator=='*') {
                    ans = num1 * num2;
                }
                else if (operator=='/') {
                    if (num2 == 0) {
                        System.out.println("dividing by zero not possible");
                    }
                    else{
                        ans = num1 / num2;
                    }
                }
                else if (operator=='%') {
                    ans = num1 % num2;
                }
            }
            else{
                    System.out.println("the inputted operator is invalid.");
            }
            System.out.println(ans);
        }
    }
}
