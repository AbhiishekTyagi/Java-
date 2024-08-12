//ArrayIndexOutofBoundException in java 
import java.io.*;
class Exc
{
	public static void main(String ... args)
	{
         // Array In java 
		 int [] arr =new int[4];
		try{
   		  System.out.println("Access element at 3 index"+arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e);
        }
        finally
        {
        	arr[0]=12;
        	System.out.println("First Element value="+arr[0]);
        }
    } 
}