package CoreJava.Strings;

import java.util.Scanner;

public class Removeduplicates {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Remove duplicate characters from a string.
        //note use LinkedHashset o(n) optimixed
        String str=sc.next();
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(!ans.contains(str.charAt(i)+""))
            {
                ans+=str.charAt(i);
            }
        }

        System.out.print("The staring : "+ ans);



    }
}
