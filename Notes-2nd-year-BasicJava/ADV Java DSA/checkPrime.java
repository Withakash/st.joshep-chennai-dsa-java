public class checkPrime {

    static boolean isPrime(int num){
         for(int  i = 2; i < num ; i++){
            if(num % i == 0 ) return false;
         }
         return true;
    }
    public static void main(String[] a){
       int number = 8;
       System.out.println(isPrime(number));
    }
}



// 20    1 2 4 5 10....20