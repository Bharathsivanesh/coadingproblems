package CoreJava.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicatenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Find duplicate element.
        int a[]={1,3,4,4,3,0,0};
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(res.contains(a[i]))
            {
                System.out.print(a[i]+" ");
            }
            else {
                res.add(a[i]);
            }
        }

    }
}
