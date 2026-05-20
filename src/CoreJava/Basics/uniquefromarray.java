package CoreJava.Basics;

import java.util.Scanner;

public class uniquefromarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        // Remove duplicates from sorted.
        // 1 2 3 3 3 4 4 4
        int a[]={1,1,1,2,3};
        int left=0;
        for(int i=1;i<5;i++)
        {
            if(a[left]!=a[i])
            {
                System.out.print(a[left]+" ");

            }
            left++;
        }
        System.out.print(a[4]);
    }
}
