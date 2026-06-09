package CoreJava.Strings;

import java.util.Scanner;

public class LongMinword {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data="I love U Bharath";
        String arr[]=data.split(" ");
        String min=arr[0];
        String max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length()<min.length())
            {
                min=arr[i];
            }
            else if(arr[i].length()>max.length())
            {
                max=arr[i];
            }
        }

        System.out.println("The max is : "+max);
        System.out.println("The min is : "+min);
    }
}
