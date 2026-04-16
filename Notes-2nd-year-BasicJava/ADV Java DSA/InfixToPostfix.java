import java.util.Stack;
public class InfixToPostFix {

    public static int prec(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        else return 0;
    }

    public static void convertInfixToPostfix(String s){
          Stack<Character> st = new Stack<>();

          for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                System.out.print(ch);
            }
            else if( ch == '('){
                st.push('(');
            }
            else if(  ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    System.out.print(st.pop());
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && prec(ch) < prec(st.peek())){
                    System.out.print(st.pop());
                }
                st.push(ch);
            }
          }

          while(!st.isEmpty()){
            System.out.print(st.pop());
          }
    }



    public static void main(String[] args){
     String s = "a*(b+c)/d";
     convertInfixToPostfix(s);   
    }
    
}
