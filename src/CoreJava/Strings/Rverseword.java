package CoreJava.Strings;

import java.util.Scanner;

public class Rverseword {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data[]="hi i Love bharath".split(" ");
        for(String str:data)
        {
            for(int i=str.length()-1 ;i>=0 ;i--)
            {
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
