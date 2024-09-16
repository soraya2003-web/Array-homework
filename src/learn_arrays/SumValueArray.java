package learn_arrays;

public class SumValueArray
{
    public int addArrayElement(int score[])
    {
        int total = 0;
        for (int i = 0; i<score.length; i++)
        {
            total= total +score[i];
        }
        return total;
    }

    public static void main(String[] args)
    {
        int score[] = {50, 20, 90, 10, 70, 60};
        SumValueArray sumValueArray = new SumValueArray();
        int result = sumValueArray.addArrayElement(score);
        System.out.println("the sum value of an integer array is " + result);
    }

}
