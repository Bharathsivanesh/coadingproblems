package CoreJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class clockwiserotation {

    //clock wise rotation
    public static void reverse(int[]a,int st,int end )
    {
        while(st<end)
        {
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a={1,2,3,4,5};  // 4 5 1 2 3
        int n=a.length;
        int ro=2;
        int r=ro%n;
        int st=0;
        int end=n-1;
        reverse(a,0,n-1);  // // Reverse entire array  5 4 3 2 1


        reverse(a,0,r-1);  // Reverse first r elements)  4 5  3 2 1

        reverse(a,r,n-1);   //  Reverse remaining elements after r to end   4 5 1 2 3
        System.out.print(Arrays.toString(a));





    }
}
