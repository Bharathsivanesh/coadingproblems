package CoreJava.Basics;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Get Number for Reverse:");
        int n=sc.nextInt();

        int m=n;
        int rev=0; //54
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

        // this do wile for handling "900" -> "009" this case
        do {
            if(m%10==0)
            {
                System.out.print("0");
                m/=10;
            }
        }while(m%10==0);



        System.out.print(rev);
    }
}
