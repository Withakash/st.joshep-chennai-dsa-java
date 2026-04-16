public class Main {

    // returnType methodName(parameters) {
    //     // code
    // }


    int findMin(int[] arr){
        int min = arr[0];

        for(int x : arr){
            if(x < min){
                min = x;
            }
        }

        return min;
    }
    
    public static void main(String[] s){
        Main m = new Main();
        int[] gArr = {1,2,3,4,5,6,7,8,0,10};
        int min = m.findMin(gArr);
        System.out.println("gArr : Min  : " + min);
    

    int[] arr2 = {10,5,12,7,22,4,6};
    int min2 = m.findMin(arr2);
    System.out.println("Arr2 : Min  : " + min2);

    // int[] arr3 = {1,-1,-5};

 }
}
