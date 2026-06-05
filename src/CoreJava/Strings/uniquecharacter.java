package CoreJava.Strings;

import java.util.HashSet;

public class uniquecharacter {
    public static void main(String[] args)
    {
        //prinit uniqu chacatert form the string
        String s="aabc";
        HashSet<Character> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(Character c:s.toCharArray())
        {
            if(!set.contains(c))
            {
                str.append(c);
                set.add(c);
            }
        }
        System.out.print(str);
    }
}
