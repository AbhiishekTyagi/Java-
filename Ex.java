//ArrayIndexOutofBoundException in java 
import java.io.*;
class Ex
{
	public static void main(String ... args)
	{
		 int[] arr =new int[3];
		try{
   		  System.out.println("Access element at 3 index"+arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception throw"+e);
        }
        finally
        {
        	arr[0]=12;
        	System.out.println("First Element value="+arr[0]);
        }
    } 
}