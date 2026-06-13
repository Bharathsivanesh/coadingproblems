import java.util.*;
public class Main
{
    //Check if Two Strings are Rotations
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data1="ABCDEF";
        String data2="FAB";
        String ans=data1+data1;
        if(ans.contains(data2))
        {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}