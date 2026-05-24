package CoreJava.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a={4,3,5,0,0};
        //Pick the small number from array and store it in left to right
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int minidx=i;

            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minidx])
                {

                    minidx=j;
                }
            }
            if(minidx!=i)
            {
                int temp=a[i];
                a[i]=a[minidx];
                a[minidx]=temp;
            }


        }
        System.out.print("The selecion sort"+ Arrays.toString(a));
    }
}
