package CoreJava.Arrays;

import java.util.Scanner;

public class Firstmaxandmin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Find largest and smallest element in an array.
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }

            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);

    }
}
