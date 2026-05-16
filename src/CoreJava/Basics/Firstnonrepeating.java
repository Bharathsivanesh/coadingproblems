package CoreJava.Basics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Firstnonrepeating {

    public static void main(String[] args)
    {

        // Find the first non-repeating character.
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Character,Integer> set=new LinkedHashMap<>();
        String data=sc.next();
        for(int i=0;i<data.length();i++)
        {
            char c=data.charAt(i);
            set.put(c,set.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>res:set.entrySet())
        {
            if(res.getValue()==1)
            {
                System.out.print(res.getKey());
                return;
            }
        }



    }
}
