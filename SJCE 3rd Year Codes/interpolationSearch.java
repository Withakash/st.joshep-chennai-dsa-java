public class interpolationSearch {
    static int interpolation(int[] arr, int target){
       int start = 0 , end = arr.length -1;
    
        if(target <= arr[start] && target >= arr[end]) 
            return -1;

       while(start <= end) {
        int mid = start + ((target - arr[start]) * (end - start)) / (arr[end] - arr[start]);

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

        int[] arr = new int[]{5,10,15,20,25,27,30,35};
         int key = 5;
        int res = interpolation(arr,key);

        System.out.println("Found the key on index : " + res);
    }
}
