package learn_arrays;

public class Array2D
{
    public void print2DArray(int a [][])
    {
        for(int i = 0; i<a.length; i++)
        {
            for(int j =0; j<a[0].length; j++)
            {
                System.out.println(a[i][j]);
            }

        }
    }

    public static void main(String[] args)
    {
        int x [][] = {{2, 5, 6, 9},{3, 8, 4, 1}};
        Array2D array2D = new Array2D();
        array2D.print2DArray(x);

    }
}
