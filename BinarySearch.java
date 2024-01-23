

public class BinarySearch {
    public static void main(String[] args) {
        int[] givenArr = {-2,4,6,7,8,9,423,500};
        int target = 7;
        System.out.println(IndexFinder(givenArr,-2));
    }
    static int IndexFinder(int[] given,int target){
        int s = 0;
        int e = given.length;
        while(s<=e){
            int m = s+e/2;
            if(target == given[m] ){
                return m;
            }
            else if(target>given[m]){
                s = m+1;
            }
            else if(target<given[m]){
                e = m-1;
            }
        }
        return-1;
    }
}
