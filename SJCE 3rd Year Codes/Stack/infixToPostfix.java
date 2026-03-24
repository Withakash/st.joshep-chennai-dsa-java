import java.util.Stack;

public class infixToPostfix{
 
    public static void infixToPost(String input){
       
         Stack<Character> st = new Stack<>();
         StringBuilder res = new StringBuilder();
        
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                 res.append(ch);
            }
            else if( ch == '(' ) {
             st.push(ch);
            }
            else if(ch == ')') {
               while(!st.isEmpty() && st.peek() != '(') {
                res.append(st.pop());
               }
               st.pop();
            }
            else{
                while(!st.isEmpty() && prec(ch) <= prec(st.peek())){
                    res.append(st.pop());
                }
                st.push(ch);

            }
        }

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        System.out.println(res);
    }

    static int prec(char ch ){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '^') return 3;
         return -1;
        
    }


    public static void main(String[] str){
        String input = "a+b*c/e";

        infixToPost(input);
    }
}