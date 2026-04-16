// import java.util.*;
public class BasicArray {

    static int x;
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int n = 10;
        // int[] arr = new int[n];
        // int sum = 0;

        // for(int i = 0 ; i < n ; i++){
        //      arr[i] = i + 1;
        //     System.out.print(arr[i] + " ");

        //     sum += arr[i];
        // }

        // System.out.print("Sum of Array : " + sum);

        // int n = 10;
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = i + 1;
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();
        // for(int i =0 ; i < n ; i++){
        //     if (arr[i] % 2 == 0)
        //         System.out.print(arr[i] + " ");
        // }


        // int[] arr1 = {7,5,3,9};
        // int[] arr2 = null;

        // arr2[0] = 99;

        // System.out.println(arr1[0] + " "+arr2[0]);

        // int[] arr = { 1, 2, 3 };
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] += i;
        // }
        // System.out.println(arr[2]);

        // int[] a = { 1, 2, 3 };
        // int[] b = a;
        // b[0] = 100;
        // System.out.println(a[0]);

        // int[] a = { 1, 2, 3 };
        // int[] b = a.clone();
        // b[0] = 100;
        // System.out.println(a[0]);

        // int[] a = { 1, 2, 3 };
        // int[] b = new int[3];
        // b = a;
        // System.out.println(b[1]);

        // int[] arr = {1,2,3,4};

        // for(int x : arr){
        //     System.out.print(x + " ");
        // }

        // int[] arr = { 1, 2, 3 };
        // for (int x : arr) {
        //     x = x * 2;
        //     System.out.print(x + " ");
        // }

        // int[] arr = { 1, 2, 3 };
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]++;
        // }
        // for (int x : arr)
        //     System.out.print(x + " ");

        // int[] arr = new int[3];
        // System.out.println(arr);

        // int[] arr = { 1, 2, 3 };
        // System.out.println(arr.hashCode());

        // int[] arr = { 1, 2, 3 };
        // int[] b = arr;
        // arr = new int[] { 5, 6, 7 };
        
        // b = new int[2];
        // System.out.println(b[0]);

        // arr(100)  |1|2|3|  <------ b(100)

        // arr(200) ---> \5\6\7\


        int[] arr = { 1, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i - 1;
            System.out.println(i +" - > " + arr[i]);
        }
        
        // int[] arr = { 1, 2, 3 };
        // System.out.println(arr instanceof Object);

        // String  s = "abc";
        // System.out.println(s.getClass());

        // boolean[] characters = {'a','b','r','t'};
        // for(char ch : characters)
        //  System.out.println(ch);




    }
}

