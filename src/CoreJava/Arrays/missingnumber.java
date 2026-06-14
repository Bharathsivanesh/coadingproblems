package CoreJava.Arrays;

public class missingnumber {
    public static void main(String[] args)
    //Find Missing Number
    {
        int[]a={1,3};
        int n=a.length+1;
        int expectedsum=n*(n+1)/2;
        int sum=0;
        for(int num:a)
        {
            sum+=num;
        }
        System.out.print(expectedsum-sum);

    }
}
