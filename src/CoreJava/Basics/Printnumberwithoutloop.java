package CoreJava.Basics;

import java.util.Scanner;

public class Printnumberwithoutloop {
    static void recursion(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=10;
        recursion(n);

    }
}
