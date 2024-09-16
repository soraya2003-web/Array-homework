package learn_arrays;

public class ReverseArray
{
    public void printReverseArray (int a[])
    {
        for( int i = a.length-1 ; i>=0; i--)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        int x [] = {23, 56, 24, 78, 98, 66, 52};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.printReverseArray(x);
    }




}



