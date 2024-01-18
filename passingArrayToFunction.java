import java.util.Arrays;
public class passingArrayToFunction {
    public static void main(String[] args) {
        // for instance we have a array named nums with 4 values {1,4,7,8} and we want to pass it into the function what actually happens under the hood lets try to understand
        // using below example
        int[] nums = {1,4,7,8}; // here we are declaring an array the memory allocation happens in the heap and nums is pointing to the object
        System.out.println(Arrays.toString(nums));
        change(nums); // when we pass nums to the change function a copy reference variable points to the same object as of the og nums array 
        // therefore changing the original object and so we can conclude that arrays in java are mutable
        // note - Strings in java are not mutable we'll find out why? afterwards
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] array){ // what this function is doing is changing the zeroth index of the array to 99
        array[0] = 99;
    }
}
