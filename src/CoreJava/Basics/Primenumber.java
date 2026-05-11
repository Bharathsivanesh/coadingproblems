package CoreJava.Basics;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n<=1)
        {
            System.out.print("Not a prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.print("Not a prime");
                return;
            }
        }
        System.out.print("Its a prime");

    }
}
