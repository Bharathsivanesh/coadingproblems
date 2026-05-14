package CoreJava.Basics;

import java.util.Scanner;

public class Vowelconsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int number = 0;
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {

            char c=str.charAt(i);
            if("aeiouAEIOU".indexOf(str.charAt(i))!=-1)
            {
                vowel+=1;
            }
            else if(c>='0' && c<='9')
            {
                number+=1;
            }
            else {
                consonant+=1;
            }

        }
        System.out.println("The vowel"+vowel);
        System.out.println("The number"+number);
        System.out.println("The consosnnat"+consonant);
    }

}
