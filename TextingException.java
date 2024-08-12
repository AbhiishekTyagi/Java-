//User Defined Exception and Customized Exception
import java.util.Scanner;
class TooYoungException extends RuntimeException{
	TooYoungException(String msg)
	  {
	  	 super(msg);    //user defined Exception 
	  }
} 
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	 {
	 	super(msg);
	 }
}
class TextingException{
	public static void main(String arguement[])
	{
		int age=Integer.parseInt(arguement[0]);
        if(age>60)
         {
         	throw new TooOldException("No chance to meet your Soul mate");
         }
         else if(age<18)
          {
          	throw new TooYoungException("Good Chance to meet Your Soul mate");
          }
          else{
          	System.out.println("Thanks for Registration you get Confirmation through E-mail!!!");
          }
	}
}