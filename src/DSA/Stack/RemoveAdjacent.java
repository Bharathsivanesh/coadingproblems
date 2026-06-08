package DSA.Stack;

import java.util.Stack;

public class RemoveAdjacent {
    //1047
    public static void main(String[] args)
    {
        String data="abbaac";
        Stack<Character> st=new Stack<>();
        for(char c:data.toCharArray())
        {
            if(st.isEmpty())
            {
                st.push(c);
            }
            else {
                if(st.peek()==c)
                {
                    st.pop();
                }
                else {
                    st.push(c);
                }
            }
        }
        System.out.print("The removed Adjacent stack is"+st);
    }
}
