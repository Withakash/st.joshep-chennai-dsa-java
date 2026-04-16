import java.util.*;
public class ConditionalStatements {

    
    public static void main(String[] a){
      //conditional  statements

    //   1. if
    //   2. else if
    //   3. else
        // int age = 12;
        // if(age > 0 && age <= 10 ) {
        //     System.out.println("Toddler");
        // }
        // else if(age >= 10 && age <= 20) {
        //       System.out.println("Teenager ");
        // }
        // else if(age > 20){
        //       System.out.println("Adult ");
        // }
        // else{
        //      System.out.println("Invalid age ");
        // }
           

        // if(true&&true) System.out.println("Yes");
        // else System.out.println("No");  

        // int rollNo = 2;

        // if(rollNo == 1) System.out.println("Jiva");
        // else if(rollNo == 2) System.out.println("Shiva");
        // else if(rollNo == 3) System.out.println("Jay");
        // else System.out.println("Not Found");

    //     int x = 10;
    //   if(x > 5)
    //    System.out.println("A");
    //   else if(x > 3)
    //   System.out.println("B");

    // int marks =  67;   //65;
    // int att = 76;      //75

    // if(marks >= 65) {
    //     System.out.println("TCS");
    //     if(att >= 75) 
    //           System.out.println("Both");
    // }
    // else if(att >= 75){
    //     System.out.println("Wipro");
    //     if(marks >= 65)
    //         System.out.println("Both");
    // }
    // else System.out.println("Not Eligibble");


    // invalid username
    // invalid password
    // Login Succesfull


    // int correctUN = 1234
    // int correct password = 6789
    // if(usernamecorrect){
    //     if(correctpass){
    //         login success
    //     }
    //     else{
    //         invalid password
    //     }
    // }
    // else {
    //     invalid username
    // }


    int correctId = 1234;
    int correctPass = 6789;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter User Id");
    int id = sc.nextInt();
    System.out.println("Enter PassWord");
    int pass = sc.nextInt();

    if(id == correctId){
       if(pass == correctPass){
             System.out.println("Login Successfully");
       }
       else {
        System.out.println("Invalid Password");
       }
    }
    else {
        System.out.println("Invalid Id");
    }


    }
}
