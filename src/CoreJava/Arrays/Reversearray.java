package CoreJava.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args)
    {
        //reverse the number
        Scanner sc=new Scanner(System.in);
        int[]a={1,2,3,4,9};
        int st=0;
        int end=a.length-1;
        while(st<=end)
        {
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
