
    
public class SumArray {

    //Input and return type

    static void change(int[] arr) {
        
        arr[0] = 99;
        System.out.println("Method Arr : " + arr[0]);
    }

    //No input No return
    // static int print(){
    //     int[] arr = { 10, 20, 30};
    //     System.out.println("Hey I printing method");
    //     System.out.println(getSum(arr));
    //     return getSum(arr);
    // }
    // Input , No return
    // static void printUser(String UserName){
    //    System.out.println("Hello " + UserName);
    // }

    public static void main(String[] str){
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        
         change(arr1);

         System.out.println("Main Arr1 :  " + arr1[0]);

        //  int[] arr2 = arr1;
        //  arr1[0] = 99;
        //  System.out.println(arr2[0]);
        
    }
}


