package vco.Assignment;

public class StringDemo2 
{
	public static void main(String[] args) 
	{
		String s= new String("hello");
		
		System.out.println(s instanceof Comparable);
		
		String s1="Hello world";
		
		System.out.println(s.contains("world"));
	}
}
