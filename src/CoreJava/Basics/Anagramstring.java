package CoreJava.Basics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagramstring {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        //method 1
//        char c[]=str1.toCharArray();
//        char c2[]=str2.toCharArray();
//
//        Arrays.sort(c);
//        Arrays.sort(c2);
//        if(Arrays.equals(c,c2))
//        {
//            System.out.print("Yes");
//        }
//        else
//        {
//            System.out.print("No");
//        }
        TreeMap<Character,Integer> col=new TreeMap<>();
        TreeMap<Character,Integer>col2=new TreeMap<>();
        for(int i=0;i<str1.length();i++)
        {
            col.put(str1.charAt(i),col.getOrDefault(str1.charAt(i),0)+1);
        }


        for(int i=0;i<str2.length();i++)
        {
            col2.put(str2.charAt(i),col2.getOrDefault(str2.charAt(i),0)+1);
        }

        if(col.size()!=col2.size())
        {
            System.out.print("Not a Anagarm");
            return;
        }
        else {
            for(Map.Entry<Character,Integer>lop:col.entrySet())

            {
                char key=lop.getKey();
                if(!col.get(key).equals(col2.get(key)))
                {
                    System.out.print("Not a anagram");
                    return;
                }
            }
        }

        System.out.print("Its a  anagram");
    }
}
