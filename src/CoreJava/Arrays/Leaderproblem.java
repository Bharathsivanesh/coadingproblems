package CoreJava.Arrays;

import java.util.Scanner;

public class Leaderproblem {
    //Leaders in an Array  arr = {16, 17, 4, 3, 5, 2}   outpyt:17 5 2
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a={8,9,7,5,3,1};
        int n=a.length-1;
        int max=a[n];
        System.out.print(max+" ");
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                System.out.print(a[i]+" ");
                max=a[i];
            }
        }
    }
}
