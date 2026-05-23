import java.lang.reflect.Array;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a[]={2,3,1,0};
//Insertion sort (Store the number in crt order ( store in ascending form left to right)
       for(int i=1;i<a.length;i++)
       {
           int key=a[i];
           int j=i-1;
           while(j>=0 && key<a[j])
           {
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=key;
       }
       System.out.print("The insertion sort"+ Arrays.toString(a));

    }
}