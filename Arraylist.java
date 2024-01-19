import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        // in contrary to how arrays work array lists dont have a specefic size they dont need to be
        // below given is the syntax for the same 
        ArrayList<Integer> list = new ArrayList<>(10);// inside the <> we cannot add primitives we need to add the wrapper class that is Integer for int
        list.add(2);//to add elements in the array
        // tho the initial capacity is 10 we can keep on adding elements.
        // for intance 
        for (int i = 0; i < 25; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
