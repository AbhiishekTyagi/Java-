//Multithreading in java using Runnable Interface 
class X implements Runnable 
{
	public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("\t from thread X:i="+i);
    	}
     System.out.println("Exit from X"); 	
    }
}
class Y implements Runnable 
{
	public void run()
    {
    	for(int i=1;i<=5;i++)
    	{
    		if(i==4)
    		{
    			suspend();
    		}
    		System.out.println("\t from thread Y:i="+i);
        }
     System.out.println("Exit from Y"); 	
    }
}
class MainThread
{
	public static void main(String...args)
	{
         X x=new X();
         Y y=new Y();
    	 Thread t=new Thread(x);
    	 Thread h=new Thread(y);
    	 t.setPriority(10);
    	 h.setPriority(1);
    	 t.start();
    	 h.start();
	}
}