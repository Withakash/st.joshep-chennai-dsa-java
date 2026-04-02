public class LinearSearch {

    static int binarySearch(int[] arr, int target){
       int start = 0 , end = arr.length -1;

       while(start <= end) {
        int mid = (start + end) / 2;

        if(arr[mid] == target) 
            return mid;
        else if(arr[mid] > target) {
            end = mid-1;
        }
        else{
            start = mid + 1;
        }
       }

       return -1;


    }
    public static void main(String[] str) {

        int[] arr = new int[]{1,3,6,7,10,13,16,18,22,26};
         int key = 7;
        int res = binarySearch(arr,key);

        System.out.println("Found the key on index : " + res);
    }
}



