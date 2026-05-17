package CoreJava.Arrays;

import java.util.Scanner;

public class secondmax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        //Find second largest number.
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // 6 3 5 2
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;//1
        for(int i=0;i<n;i++)
        {
            if(a[i]>max1)
            {
                int temp=max1;
                max1=a[i];
                max2=temp;
            }
            else if(a[i]>max2 && a[i]!=max1)
            {
                max2=a[i];
            }
        }
        System.out.print("The max2 is :"+max2);

    }
}
