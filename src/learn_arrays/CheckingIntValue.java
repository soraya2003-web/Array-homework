package learn_arrays;

public class CheckingIntValue
{
    public boolean checkIntValue(int score[] , int x)
    {
        boolean exist = false;
        for(int i = 0; i<score.length; i++)
        {
            if(score[i] == x)
            {
                exist = true;
            }
        }

        return exist;
    }

    public static void main(String[] args)
    {
        int number = 10;
        int []scores = {5, 3, 7, 8, 6, 4};
        CheckingIntValue checkingIntValue = new CheckingIntValue();
        boolean result = checkingIntValue.checkIntValue(scores, number);
        System.out.println(" the " + number + " exist in the array ? " + result);
    }
}
