package CoreJava.Arrays;

import java.util.Scanner;

public class Checksortedarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a={1,2,5,7};
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                System.out.print("Not Sorted");
                return;
            }
        }
        System.out.print("Sorted");
    }
}
