package CoreJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Movezerosend {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Move all zeros to end.
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                a[idx]=a[i];
                idx++;
            }
        }
        for(int j=idx;j<n;j++)
        {
            a[j]=0;
        }

        System.out.print("The Arrays is"+ Arrays.toString(a));


    }
}
