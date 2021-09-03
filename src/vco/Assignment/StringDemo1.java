package vco.Assignment;

public class StringDemo1 
{
	public static void main(String[] args) 
	{
		// String object will create here
		String s1 =new String("hello");
		String s2="hello";
		
		// here it will compare the addresses of these two object
		if(s1==s2)
		{
			System.out.println("s1=s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		
		// this is the overridden method compare the literals if literals are same it shows same adders number
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		//print the length of the string
//		System.out.println(s1.length());
//		System.out.println(s2.length());
		
		//converting all characters into a upper case
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toLowerCase());
		
		// print the character at the index of number
//		System.out.println(s1.charAt(2));
//		System.out.println(s2.charAt(4));
		
		//here it compares last characters if same shows true other wise false
//		System.out.println(s1.endsWith(s2));
		
		// this method print the literals depending upon passing integer number
//		System.out.println(s1.repeat(1));
//		System.out.println(s2.repeat(2));
		
	}
}
