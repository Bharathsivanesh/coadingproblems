package CoreJava.Basics;

import java.util.Scanner;

public class conversions {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        char c= sc.next().charAt(0);

        // 1) int to string
        String test=n+"";

        //2)string to int
        int num=Integer.parseInt(test);


        //3) char to String
        String test2= c+"";

        //4) String to char

        char dummy=test2.charAt(0);

        //digit (char) to number
        char ch='5';
        System.out.print(ch-'0');  //'5' -> 5

        //number to char(digit)
        char k=(char)(5+'0');  //doubt
        System.out.print(k);  //5 -> '5'

        //char → int (ASCII value)  char ch = 'A'; -> 65
        int m=c;

        //int → char (ASCII)
        System.out.print((char)n);  //65 -> 'A'


        // string to chararray
        char arr[]=str.toCharArray();


        //chararray to string
        char arrw[] = {'h','e','l','l','o'};
        System.out.print(new String(arr));



        //char → uppercase
        ch = Character.toUpperCase(ch);



        //ASCII   65 ('A') to 90 ('Z')    and 97 ('a') to 122 ('z)  and  48 (0) to 57 (9)








    }
}
