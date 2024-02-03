public class Strings {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a;
        for(int i = 0;i<b.length;i++){
            b[i] = 0;
        }
        for(int i = 0;i<b.length;i++){
            System.out.println(a[i]);
        }
    }
}
