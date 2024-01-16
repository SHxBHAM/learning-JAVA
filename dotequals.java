// we will be discussing about .equals thingy in js 
// the below code snippet checks if str is equivalent to shubham the problem is that it actually checks if str is pointing to the same value ("shubham")
// as the other variable(if there was one)
// String str = "shubham";
// if(str == "shubham");
// this might return false if str2 points to another copy of "shubham" in the below snippet
// String str1 = "shubham"
// String str2 = "shubham"
// if(str1 == str2);
// to tackle this problem we use .equals instead.

import java.util.Scanner;

public class dotequals{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String naya = input.next();
        if(naya.equals("shubham")){
            System.out.println("acha bhai hamen sikhariya ??");
        }
    }
}