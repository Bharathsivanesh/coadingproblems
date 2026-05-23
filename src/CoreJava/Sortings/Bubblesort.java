package CoreJava.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Bubble sort (descending order  store in end of array)

        int[]a={3,2,5,0,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        System.out.print(Arrays.toString((a)));
    }
}
