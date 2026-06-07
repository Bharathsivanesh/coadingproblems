package DSA.Stack;
import java.util.*;
public class Validparenthesis {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Character>st=new Stack<>();
        String data="{{}";
        for(Character c:data.toCharArray())
        {
            if(c=='(')
            {
                st.push(')');
            }
            else if(c=='[')
            {
                st.push(']');
            }
            else if(c=='{')
            {
                st.push('}');
            }
            else {
                if(st.size()==0 || st.pop()!=c)
                {
                    System.out.print("Not valid");
                    return;
                }
            }

        }
        if(st.size()!=0)
        {
            System.out.print("Not valid");
            return;
        }

        System.out.print("valid");
    }
}
