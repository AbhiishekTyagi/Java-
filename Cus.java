//User Defined Exception or Custom Exception in java 
class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
		super(msg);
	}
}
class Cus
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);
		if(age>60)
		{
			throw  new TooOldException("To Old for this Sorry");
		}
		else if(age<18)
		{
			throw new TooYoungException("To Young for this Sorry");
		}
		else 
		{
			System.out.println("Welcome Sir");
		}
	}
}
