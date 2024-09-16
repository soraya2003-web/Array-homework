package learn_arrays;

public class OddAndEvenNumberOfArray
{
    public void printOddAndEvenNumbers(int s [])
    {
        for(int i =0; i<s.length; i++)
        {
            if(s[i] % 2 ==0)
            {
                System.out.println(s[i] + " is even ");
            }
            else
            {
                System.out.println(s[i] + " is odd ");
            }
        }
    }

    public static void main(String[] args)
    {
        int a[] = {52, 36, 56, 89, 20, 30};
        OddAndEvenNumberOfArray oddAndEvenNumberOfArray = new OddAndEvenNumberOfArray();
        oddAndEvenNumberOfArray.printOddAndEvenNumbers(a);
    }
}
