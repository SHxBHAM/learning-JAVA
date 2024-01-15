import java.util.Scanner;

public class countingoccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        System.out.print("please enter the number: ");
        int n = input.nextInt();
        int given = n;
        System.out.print("please enter the target number to count occurences: ");
        int target = input.nextInt();
        while (n>0) {
            int temp = n%10;
            if (temp == target) {
                flag++;
            }
            n = (int)(n/10);   
        }
        if (flag>0) {
            System.out.println("there are total "+flag+" occurences of "+target+" in "+given); 
        }
        else{
            System.out.println("there is no occurences of "+ target +" in "+given);
        }
    }
}
