package learn_arrays;

public class MaxAndMinOfTwoDArray
{
    public void maxAndMinTwoDArray(int x[][])
    {
        int max = x[0][0];
        int min = x[0][0];
        for(int i = 0; i<x.length; i++)
        {
            for(int j = 0; j<x[0].length; j++)
            {
               if(x[i][j]>max)
               {
                   max = x[i][j];
               }

               if(x[i][j]<min)
               {
                   min = x[i][j];
               }
            }
        }
        System.out.println("maximum value is " + max);
        System.out.println("minimum value is " + min);
    }

    public static void main(String[] args)
    {
        int a[][]= {{36,58,22},{69,12,63}};
        MaxAndMinOfTwoDArray maxAndMinOfTwoDArray = new MaxAndMinOfTwoDArray();
        maxAndMinOfTwoDArray.maxAndMinTwoDArray(a);

    }

}
