import java.util.*;
public class Main
{
    //283
    public static void main(String[] args)
    {
        int[]a={1,2,3,0,7};
        int left=0;
        int right=0;
        while(right<a.length)
        {
            if(a[right]!=0)
            {
                int temp=a[right];
                a[right]=a[left];
                a[left]=temp;
                left++;
            }
            right++;
        }
        System.out.print(Arrays.toString(a));

    }
}