package vco.Assignment;

public class StringBuilderDemo4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		
		//shows the capacity of string in integer number
		System.out.println(sb.capacity());
		
		// this method performing concatenate operation
		System.out.println(sb.append("hello world"));
		
		//print the length of the string in integer number
		System.out.println(sb.length());
		
		//print the character at specified index position
		System.out.println(sb.charAt(4));
		
		//print the index position in integer number
		System.out.println(sb.indexOf("d"));
		
		//print the last character integer number which we passed in the calling method
		System.out.println(sb.lastIndexOf("w"));
		
		System.out.println(sb.replace(6, 11, "java"));
	}
}
