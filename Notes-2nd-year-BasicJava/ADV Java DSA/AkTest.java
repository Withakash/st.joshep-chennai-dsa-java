public class AkTest {
    public static void change(int[] arr){
        arr = new int[4];
        arr[0] = 10;

    
        System.out.println("inside " + arr[0]);
    }
    public static void main(String[] s){
        int[] arr = new int[]{1,2,3};
        AkTest.change(arr);
        System.out.println("Local " + arr[0]);

    }
}
