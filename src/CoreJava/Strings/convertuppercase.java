package CoreJava.Strings;

import java.util.Scanner;

public class convertuppercase {

    public static void main(String[] args)
    {
        //Convert lowercase to uppercase without built-in methods.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>=97 && c<=122)
            {
                ans+=(char)(c-32);
            }
            else {
                ans+=c;
            }
        }
        System.out.print("String is : "+ans);
    }
}
