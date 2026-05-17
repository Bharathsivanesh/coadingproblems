package CoreJava.Basics;

public class swaptwonumber {
    public static void main(String[] args)
    {
        int a=5;
        int b=9;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The a:"+a);
        System.out.println("The b:"+b);
    }
}
