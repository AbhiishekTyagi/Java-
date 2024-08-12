//User Defined Exception 
class Withdraw extends RuntimeException
{
	Withdraw(String m)
	{
		super(m);//Provide Description to Upper class
	}
}
class NotWithdraw extends RuntimeException
{
	NotWithdraw(String m)
	{
		super(m);//Provide Description to Upper class
	}
}
//Main class
class Des
{
	public static void main(String [] arg)
	{
		float bal=Float.parseFloat(arg[0]);
		float am=Float.parseFloat(arg[1]);
		if(bal<am)
		{
			throw new NotWithdraw("Insufficient Balance");
		}
		else if(bal>am)
		{
			throw new Withdraw("Sufficient Balance");
		}
	}
}