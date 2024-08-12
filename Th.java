//Using the throws keyword to delegates the exception handling to upper class like 
//RuntimeException, Exception,Throwable Class
class Th
{
	void check(int r)
	 	{
	 	 try
	 	  {
	 	    int a=100/r;
	          }
	      catch(Exception e)
	        {
	    	  System.out.println(e);
	           }
	           //Rest of Statement Execute
	 	System.out.println("Exception Handling");
	     } 
	 public static void main(String ...args) 
	 {
	 	Th t=new Th();
	    t.void check();
	 }
} 