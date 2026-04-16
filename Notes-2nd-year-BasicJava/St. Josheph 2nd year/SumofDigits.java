

public class SumofDigits {

    //  1 2 3 4 = 
    //                    10)1( .1
    // //  %10                  0
    // //  /10               ----------
    //                         10
    //                         10

    //  Digit = 1234                         
    //      %10            /10
    //  1.      4              123      
    //  2.      3              12
    //  3.      2              1
    //  4.      1              0

     public static void main(String[] s){
    //   int value = 12345;
    //   int res = 0;
    //                          // euc-tytx-fxx    
    //   while(value > 0){
    //   res = res + (value%10);
    //   value = value/10;
    //   }

    //   System.out.println("Sum is : "+ res);


    //     int value = 2546987;
    //   int res = 1;
    //                          // euc-tytx-fxx    
    //   while(value > 0){
    //   res = res * (value%10);
    //   value = value/10;
    //   }

    //   System.out.println("Multiplication is : "+ res)
    // ;


    //   int value = 789461923;
    //   int max = value % 10;

    //   while(value > 0){

    //     int lastDigit = value % 10;
    //     if(lastDigit > max) {
    //         max = lastDigit;
    //     }

    //     value = value / 10;
    //   }

    //   System.out.println("Max is : "+ max);

    // Armstrong Numbers

            //    int num = 15345;
            //    int aNum = 0;
            //    int bcup = num;

            //    while(num > 0){
            //     int lastD = num % 10;
            //      aNum += (lastD * lastD * lastD);

            //      num /= 10;
            //    }
        

            //    if(bcup == aNum)
            //     System.out.println(bcup + " is a ArmStrong Number");
            //    else 
            //     System.out.println(bcup + " Not an ArmStrong Number");




            //    // Power Main

            //    int number = 6;
            //    int power = 6;
            //    int pow = 1;
            //    for(int i = 0 ; i < power ; i++){
            //       pow = pow * number;
            //    }

            //    System.out.println("Pow is : " + pow);


        //    int number = 54747;
        //    int n = number;
        //    int count  = 0;

        //    while(n > 0){
        //     count++;
        //     n/=10;
        //    }
        // //    System.out.println("Count = "+ count);

        //  int num = number;
        //  int aNum = 0;
        //  while(num > 0){
        //     int lastD = num % 10;
        //     int pow = 1;
        //     for(int i =0 ; i < count ; i++){
        //         pow = pow * lastD;
        //     }

        //     aNum = aNum + pow;

        //     num/=10;
        //  }
        //        if(number == aNum)
        //         System.out.println(number + " is a ArmStrong Number");
        //        else 
        //         System.out.println(number + " Not an ArmStrong Number");

     


        //Reverse a Number

    //     int num = 1234;
    //     int rev = 0 ;

    //     while(num > 0){
    //         rev = rev * 10 + num % 10;
    //         num/=10;
    //     }
    //    System.out.println("Rev is : "+ rev);
    
              


    //  Digit = 1234                         
    //      %10            /10
    //  1.      4              123      
    //  2.      3              12
    //  3.      2              1
    //  4.      1              0


    //check palindrome


          int number = 1231;
          int rev = 0;

         int num = number;


        while(num > 0){
            rev = rev * 10 + num % 10;
            num/=10;
        }
    //    System.out.println("Rev is : "+ rev);         




          if(number == rev ) System.out.println(number + " : Palindrome");
          else System.out.println("Not Palindrome");

    }

}
