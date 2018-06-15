import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinus 
{

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) 
    {
        /*
         * Write your code here.
         */
    	
    	PlusMinus pm = new PlusMinus();
    	pm.printResultSet(pm.getFractionsForArray(arr));    	

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) 
        {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
    
    private float[] getFractionsForArray(int[] the_array)
    {
    	int positiveCount = 0;
    	int negativeCount = 0;
    	int zeroCount = 0;
    	int totalCount = the_array.length;
    	
    	float[] finalArray = new float[3];
    	
    	for(int i=0; i< the_array.length; i++)
    	{
    		int valueToCheck = the_array[i];
    		if(valueToCheck > 0)
    		{
    			positiveCount++;
    		}
    		
    		if(valueToCheck < 0)
    		{
    			negativeCount++;
    		}
    		
    		if(valueToCheck == 0)
    		{
    			zeroCount++;
    		}
    	}
    	
    	float positiveFrac = this.getFraction(positiveCount, totalCount);
    	float negativeFrac = this.getFraction(negativeCount, totalCount);
    	float zeroFrac = this.getFraction(zeroCount, totalCount);
    	
    	finalArray[0] = positiveFrac;
    	finalArray[1] = negativeFrac;
    	finalArray[2] = zeroFrac;
    	
    	return finalArray;
    	
    }
    
    private float getFraction(int the_count, int overall_count)
    {
    	float result_value = (float) 0.0;
    	
    	result_value = (float) the_count/overall_count;
    	
    	return result_value;
    }
    
    private void printResultSet(float[] float_array)
    {
    	this.printpositivefraction(float_array[0]);
    	this.printnegativefraction(float_array[1]);
    	this.printzerofraction(float_array[2]);
    }
    
    private void printpositivefraction(float value_to_print)
    {
    	System.out.println(value_to_print);
    }
    
    private void printnegativefraction(float value_to_print)
    {
    	System.out.println(value_to_print);
    }
    
    private void printzerofraction(float value_to_print)
    {
    	System.out.println(value_to_print);
    }
}
