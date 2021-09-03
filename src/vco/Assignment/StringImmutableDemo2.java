package vco.Assignment;

// make class final it cannot be inherit to other classes
public final class StringImmutableDemo2 
{
	//private is use to hiding the data from out side the class and final means value can't be change
	private final int x;
	
	//Constructor are use to initialize the value
	public StringImmutableDemo2(int x)
	{
		this.x=x;
	}
	
	// this method is use to modify the value of x
	public StringImmutableDemo2 modify(int x)
	{
		if(x!=this.x)
		{
			return new StringImmutableDemo2(x);
		}
		else
		{
			return this;
		}
	}
	public static void main(String[] args) 
	{
		// creating the object of class and assigning integer value 
		StringImmutableDemo2 d1=new StringImmutableDemo2(10);
		StringImmutableDemo2 d2=d1.modify(20);
		StringImmutableDemo2 d3=d1.modify(10);
		
		if(d1==d2)
		{
			System.out.println(d1.equals(d2));
		}
		else if(d1==d3)
		{
			System.out.println(d1.equals(d3));
		}
		System.out.println(d1==d2);
		System.out.println(d1==d3);
	}
		
		
}
