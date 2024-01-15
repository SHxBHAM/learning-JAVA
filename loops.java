public class loops{
    public static void main(String[] args) {
        // there are three types of loops for loop while loop and do while loop
        // the following is the syntax for the loops 
        // FOR LOOP
        for (int i = 0; i < 5; i++) {      // for loop is usually used when we already know the no. of iterations required.
            //System.out.println("hello world");
        }
        int x=1;
        // WHILE LOOP
        while (x<=5) {
            System.out.println("this is inside while loop");
            x++;// this means adding 1 this could be also written as x+=1
        }
        // DO WHILE LOOP
        do{
            System.out.println("inside Do while loop."); // what do while loop does is first run the do block and then check condition
            x++; // this means the do block will run atleast once.
        } while(x<10);

    }
}