package CoreJava.Basics;

import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("palindrome number");
        int temp=n;
        int rev=0;
        while(n>0)   //123
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==temp)
        {
            System.out.print("Its a palindrome number");
        }
        else {
            System.out.print("Not a palindrome number");
        }
    }
}
