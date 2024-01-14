import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name); 
        int rollno = input.nextInt();
        System.out.println("your rollno. is = " + rollno);
        int a = 10;// this is one way to initialize a variable here 'a' is identifier and 10 is a literal 
        //we can also use Integer instead of int as in this case we get extra methods as we are  using the wrapper class Int 
        Integer b = 3109;
        b.toString(); // one such method is to string
    }
}
