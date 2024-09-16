package learn_arrays;

public class SumValue2DArray
{
    public int sumValue2DArray (int score[][])
    {
        int total = 0;
        for(int i =0; i<score.length; i++)
        {
            for(int j= 0; j<score[0].length; j++)
            {
                total = total + score[i][j];
            }
        }
        return total;

    }

    public static void main(String[] args)
    {
        int score [][] = {{50, 20, 90},{10, 70, 70}};
        SumValue2DArray sumValue2DArray = new SumValue2DArray();
        int result = sumValue2DArray.sumValue2DArray(score);
        System.out.println("the sum value of a 2D array is " + result);

    }
}
