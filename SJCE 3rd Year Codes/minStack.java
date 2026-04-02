public class minStack {
    public static void main(String[] str){
        int[] arr = {11,2,5,7,1,20,3};

        int min = arr[0];

        for(int x : arr){
            if(x < min) min = x;
        }

        System.out.println("Min is  : " + min);

    }
}
