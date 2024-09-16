package learn_arrays;

public class AverageValueArray
{
    public int countAvg( int score[])
    {
         int total = 0;
         int avg;
        for( int i = 0; i<score.length; i++)
        {
            total = total + score [i];
        }

        avg = total /5;

        return avg;

    }

    public static void main(String[] args)
    {
        int score[] = {6,4,1,2,3};
        AverageValueArray averageValueArray = new AverageValueArray();
        int result = averageValueArray.countAvg(score);
        System.out.println("the average value of int array is " + result);
    }
}
