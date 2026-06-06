package CoreJava.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatcher {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data="Abc12cujh90";
        Pattern pattern=Pattern.compile("\\d+");  //"\\D+" MEANS OPPRISTE IT diplays strings

        //[a-z] -> Lowe case
        //[0-9] -> digits one bu one "+" means more than 1
        //"[a-zA-Z]+|\\d+" -> both letters and dighits
        Matcher matcher=pattern.matcher(data);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }

    }
}
