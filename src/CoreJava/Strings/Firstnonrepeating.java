package CoreJava.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeating {
    public static void main(String[] args)
    {
        String data="abaaccl";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:data.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>res:map.entrySet())
        {
            if(res.getValue()==1)
            {
                System.out.print("The First Character:   "+res.getKey());
                return;
            }
        }

    }
}
