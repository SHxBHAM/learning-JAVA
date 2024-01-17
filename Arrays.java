public class Arrays {
    public static void main(String[] args) {
        // Array is a type of Data Structure where we store a collection of data 
        // in the case of java we cannot store different data types in a array
        // below given is the syntax for an array
        // datatype[] identifier name = new datatype[size]
        int[] Array1 = new int[5]; // this is how we declare an array with datatype of int and size five
        // what the above line means is that Array1 is a reference variable which points to the object array with datatype int and size 5
        //------------------------------OR---------------------------------------------------------------------------------
        // we can also initialize an array directly like shown below
        int[] Array2 = {2,3,4,5,6} ;
        // break down of what happens when
        int[] Array; // declaration: this is when Array is declared in the STACK this part is happening during the compile time
        Array = new int[5]; // initialisation: this is when the object is actually being created in the memory (heap)
        // this part happens during the run time which means this is dynamic memory allocation.

        // --------------------------------------IMPORTANT STUFF-----------------------------------------------------------------
        // we already know in the case of c/c++ the array elements are stored continously that means one after another (addresses)
        // but in the case of java there is no concept of pointers so this is not mandatory that the array elements will be stored continously
        // it totally depends on the JVM
        
        //NOW what if we dont put any element inside array but initialise it lets see what is actually stored then
        // this  depends upon the data type of array
        int[] check = new int[5];
        System.out.println(check[1]); // indexes start from 0 'check[1] actually means the element inside the array check at index 1'
        // in the case of int all the elements are initialised as 0 if we dont give values
        // lets check in the case of string
        String[] check2 = new String[5];
        System.out.println(check2[4]);
        // all the elements are initialised as null in the case of String

        // ----------------------------------------NULL------------------------------------------------
        // now coming to what is null, null is a special type of literal in java which can only be assigned to non primitives
        // for example
        // String newstr = null; is possible as String is not a primitive
        // int a = null; is not possible as int is a primitive
    }
}
