package learn_arrays;

public class NumericAndStringArray
{
    public static void main(String[] args)
    {
        int[] a = {64, 25, 12, 22, 11};
        NumericAndStringArray numericAndStringArray = new NumericAndStringArray();
        numericAndStringArray.numericString(a);

        System.out.println("sorted a: ");
        for(int i : a)
        {
            System.out.println(i + " ");
        }

    }
    public static void numericString(int[]a)
    {
        int n = a.length;
        for(int i =0; i< n-1; i++)
        {
            for(int j = 0; j<n-i-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
