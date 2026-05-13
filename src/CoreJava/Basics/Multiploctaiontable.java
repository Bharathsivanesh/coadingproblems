package CoreJava.Basics;

import java.util.Scanner;

public class Multiploctaiontable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i +"*"+ n+"=" +i*n);
        }
    }
}
