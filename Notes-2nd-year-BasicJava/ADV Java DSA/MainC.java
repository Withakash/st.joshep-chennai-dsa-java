
class UserDetails{
   String name;
   int rollno;
   float marks;   //              Heap :
//          Satck : stud1 ---> [name : "Akash" , rollno = 7, marks = 77.6f]
                    // stud2  ----^

   UserDetails(){
    System.out.println("Default Constructor called");
   }

   UserDetails(String n,int r,float m){
       name = n;
       rollno = r;
       marks = m;
   }
 
}
public class MainC {
    public static void main(String[] s){
       UserDetails stud1 = new UserDetails("Akash",7,77.6f); 
        //  System.out.println(stud1.name);
        //  System.out.println(stud1.rollno);
        //  System.out.println(stud1.marks);

         UserDetails stud2 = stud1;
         stud2.name = "Anish";
         System.out.println(stud1.name);
         

    

    } 
}





















// int ch = 'a';
// System.out.println((char)++ch);

// for(char i = 'A' ; i < 'Z' ; i++){
// System.out.println(i);
// }
// ' ;