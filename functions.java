public class functions {
    // function is called method in java terminology
    public static void main(String[] args) {
        greetings("Shubham"); // this is a simple cfunction call with "Shubham as an argument"
    }
    // a method is a block of code which can be reused on need
    // method can take parameters/arguments and perform dtuff on those  values
    // below is the syntax for a simple method
    static void greetings(String name){ // static is required as we cant use non static function inside static function as main is static we use static here aswell
        // void is the return type (we usually use void when we dont wanna return anything or display something via a function) 'greetings' is the name of the function
        // name is the parameter whose data type is String.
        System.out.println("Greetings! "+name+" welcome to the console.");
    }
}
