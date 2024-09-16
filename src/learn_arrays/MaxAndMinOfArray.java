package learn_arrays;

public class MaxAndMinOfArray
{
   public void maxAndMinOfAnArray (int x[])
   {
       int max = x[0];
       int min = x[0];
       for(int i = 1; i<x.length; i++)
       {
           if(x[i]>max)
           {
               max = x[i];
           }
           if(x[i]<min)
           {
                   min = x[i];
           }
       }
       System.out.println("maximum value is " + max) ;

       System.out.println("minimum value is " + min);

   }

   public static void main(String[] args)
   {
       int a[] = {32, 45, 67, 56, 89, 98};
       MaxAndMinOfArray maxAndMinOfArray = new MaxAndMinOfArray();
       maxAndMinOfArray.maxAndMinOfAnArray(a);
   }




}
