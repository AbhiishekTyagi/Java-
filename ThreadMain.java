//Multithreading in java using extends Thread class
class A extends Thread
{
    public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("\t from thread A:i="+i);
    	}
     System.out.println("Exit from A"); 	
    }
}
class B extends Thread
{
	public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		if(i==4)
    		{
    			stop();
    		}
    		System.out.println("\t from thread B:i="+i);
    	}
     System.out.println("Exit from B"); 	
    }
}
class C extends Thread
{
	public void run() 
    {
    	for(int i=1;i<=5;i++)
    	{
    	  try
    	 {
    		if(i==4)
    		{
    			sleep(10000); //InterruptedException Raise checked Exception 
    		}
    	  }
    	  catch(InterruptedException e)
    	  {
    	  	System.out.println(e);
    	  }
    		System.out.println("\t from thread C:i="+i);
    	}
     System.out.println("Exit from C"); 	
    }
}
class ThreadMain
{
	public static void main(String ...args)
	{
		A threada=new A();
		B threadb=new B();
		C threadc=new C();
		threada.setPriority(1);
	    threadb.setPriority(5);
	    threadc.setPriority(10);
		threadb.start();
		threada.start();
		threadc.start();
	}
}