
package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.HashMap;

public class longestKSubstr {
//Longest Substring with K Uniques (gfg)

    public static int lengthOfLongestuniqueSubstring(String s, int k) {

        int left=0;
        int max=-1;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {

            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

            while(map.size()>k)
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);

                if(map.get(s.charAt(left))==0)
                {
                    map.remove(s.charAt(left));
                }
                left++;

            }


            if(map.size()==k)
            {
                max=Math.max(max,i-left+1);
            }
        }
        return max;
    }



    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k=3;

        int result = lengthOfLongestuniqueSubstring(s,k);//7  "cbebebe"

        System.out.println("Longest Substring with K Uniques\n " + result);
    }
}
