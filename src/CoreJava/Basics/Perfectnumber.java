package CoreJava.Basics;

import java.util.Scanner;

public class Perfectnumber {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        /// Check Perfect Number
        // 6 => 1 +2+3 =6  (sum of divisor of n exclude n)
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.print("Yes");
        }
        else {
            System.out.print("NO");
        }



    }
}
