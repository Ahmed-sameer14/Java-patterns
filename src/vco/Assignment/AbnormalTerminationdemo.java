package vco.Assignment;

public class AbnormalTerminationdemo 
{
	public static void main(String[] args) 
	{
		System.out.println("abnormal termination");
		
		int x=10;
		int y=0;
		try
		{
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println("catch block is executed");
			e.getMessage();
		}
		System.out.println(x);
		System.out.println(y);
	}
}
