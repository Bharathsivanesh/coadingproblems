package CoreJava.Basics;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //153=1*3 + 5*3 +3*3 =153
        int ans=0;
        String str=n+"";

        while(n>0)  //153
        {
            int temp=n%10;
//            ans+=Math.pow(temp,str.length());
            int power=1;    // insaord of Math.pow funstion
            for(int i=0;i<str.length();i++)
            {
                power*=temp;
            }
            ans+=power;
            n/=10;
        }
        if(ans==Integer.parseInt(str))
        {
            System.out.print("The Armstrong number is "+ans );
        }
        else {
            System.out.print("No");
        }



    }
}
