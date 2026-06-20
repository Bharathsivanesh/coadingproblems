package CoreJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anticlockwiserotaion {

    // Anri - clock wise rotation
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
//        return a;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a={1,2,3,4,5};  // 3 4 5 1 2
        int n=a.length;
        int ro=2;
        int r=ro%n;
        int st=0;
        int end=n-1;
        reverse(a,0,r-1);  // // Reverse first r elements // 2 1 3 4 5

        reverse(a,r,n-1);  // Reverse after r elements  2 1 5 4 3

        reverse(a,0,n-1);   //  Reverse entire elements   3 4 5 1 2
        System.out.print(Arrays.toString(a));





    }
}
