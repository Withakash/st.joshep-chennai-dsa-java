public class Firstprogram {
  public static void main(String[] args){
    // char x = 'a';
    // char y = 'k';
    // System.out.printf("%c%c\n",x,y); // printf
    // System.out.print(x+""+y);   // concat

    //  int x = 2*5;   //2.5 

    // int a = 100 , b = 20;
    // System.out.println(a+b);
    //  System.out.println(a-b);
    //   System.out.println(a*b);
    //    System.out.println(a/b);
    //     System.out.println(a%b);


    //  int x = 10;
    //  System.out.println("First : " + x++);  //x = x + 1 //assignment -> increment 
    //  System.out.println("Second : " + x);

    // //  int y = 10;
    //  System.out.println("First : " + ++y);  //x = x + 1 //assignment -> increment 
    //  System.out.println("Second : " + y);
   
      // int a = 5;                  // a = 7
      // int b = a++ + ++a;           //b = 5   +  7 = 12
      // System.out.println(b);

//       int a = 3;
// int b = 4;
// int c = a++ + b++;
// System.out.println(a + " " + b + " " + c);

      // int a = 5;        // a = 7
      // int b = 10;       // b = 8
      //                   // c =  5  + 10   + 7   + 8
      // int c = a++ + b-- + ++a + --b;
      // System.out.println(c);    

      // int a = 5;
      // int b = a++ + a++ + ++a;
      // System.out.println(a + " " + b);

      // int a = 1;    // a = 5
      // int b = a++ + ++a + a++ + ++a;  //b =  1 + 3 + 3 + 5
      // System.out.println(a + " " + b);


      // int a = 3;       // a = 4
      // int b = 2;       // b = 4
      //                  // c = 3   +  3  *  4  + 3
      // int c = a++ + ++b * a++ + b++;
      // System.out.println(a + " " + b + " " + c);


      // int x = 5;

      // x = x++ + ++x + x++ + ++x;
      // System.out.println(x);

      // int a = 10;

      // int b = a++ + ++a + a-- + --a; 

      // int a = 7, b = 5;
      //  System.out.println(++a > b++ && a++ > --b);
      //  System.out.println(a + " " + b);
  
      int a = 11;
      int b = 2;

      int res =  a & b;
      System.out.println(res);

      //  0      0     1     0
      //    0 * 2^0 + 1 * 2^1 + 0 * 2^2 + 0 * 2^3

      // = 2

      | 
  
  }  
}

// SSID - PTC

// password - Ptc@#750

// byte  - 1 byte     -2^(n-1) ---- > 2^(n-1) - 1       -128 ----> 127
// short - 2 byte       n = bits   1  byte = 8 bit       -32768 ----> 32767
// int -  4 byte        
// long - 8 byte
// float - 4 byte
// double -  8 byte
// char - 2 byte
// boolean = unknown



// int x = 1 + 2 + 3;

// Arithmetic operators

// + 
// -
// *
// /
// %


// Assignment Operators

// =    direct assignment
// +=     x += y   (x = x+y)
// -=     c = c-y
// /=      c = c/y
// *=      c = c*y
// %=      c = c%y

//Unary Operators

// ++  increment   ++x (pre-increment)    
//                 x++  (Post-increment)(x = x+1)
// --              --x (Pre-decrement)(x= x- 1)
//                 x++ (Post-decrement)
// !          (invert the condition)



//relationals

// ==
// !=
// <
// >
// >=
// <=

//Logical operators

// &&

// int age = 10 ;
// System.out.println(age > 18 && age < 25);

// true true  = true
// true false = false
// false true = false
// false false = false


// ||
// int age = 10 ;
// System.out.println(age > 18 || age < 25);

// true true  = true
// true false = true
// false true = true
// false false = false


// !

// ! true = false
// ! false = true


// Bitwise operator
//  &   one true all true
//  |   one false all false
//  ^   same value 


// true true = true
// true false = false
// false true = false
// false false = true

// //  ~

//  !true = false
// //  <<              0 1 0 1 
//                     <<
//                     1 0 1 0

// //  >> 
//                     1 0 1 0
//                     >>
//                     0 1 0 1

 //0  = 000
 //1  = 001
 //2  = 010
 //3  = 011
 //4  = 100
 //5  = 101
 //6  = 110
 //7  = 111



                // 11 / 2 =  5   |  1
//                              5  / 2 =  2   | 1
//                              2 / 2  =  1   | 0
//                              1 / 2  =  0   | 1
                             
// int a = 11 ;                 //1 0 1 1
// int b = 2;                   //0 0 1 0
//                             ------------
//                     // res =      0 0 1 0

// int res = a & b;


//Ternary perator 

// condition ? value1 : value2;

// int x = 10 , y = 20;

// char ch = x > y ? "y" : 'n';


// Expressions & Operator Precedence

  // a + b + c 

  // 10 + 2 + 5


  // int x = 10 + 5 * 2; 

  // 10 > 5


  // 10 * 2 * 5 / 3 + 5

  
  res = x = y  = 2;