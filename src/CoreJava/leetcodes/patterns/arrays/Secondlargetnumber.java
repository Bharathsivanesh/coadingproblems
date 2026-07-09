package CoreJava.leetcodes.patterns.arrays;

public class Secondlargetnumber {
    public static int getSecondLargest(int[] arr) {
        // code here
        int first=-1;
        int second=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            if(arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        return second;

    }
    public  static void main(String[] args)
    {
        int[]a={11,22,22};
System.out.println("The Second Largets Number is : "+getSecondLargest(a));
    }
}
