package vco.Assignment;

import java.io.Serializable;

public class StringBufferDemo3 {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		
		//shows the capacity of string in integer number
		System.out.println(sb.capacity());
		
		// this method performing concatenate operation
		System.out.println(sb.append("welcome to java world"));
		
		//print the length of the string in integer number
//		System.out.println(sb.length());
		
		//print the character at specified index position
//		System.out.println(sb.charAt(4));
		
		//print the index position in integer number
//		System.out.println(sb.indexOf("o"));
		
		//print the last character integer number which we passed in the calling method
//		System.out.println(sb.lastIndexOf("o"));
		
		// this method return the substring from the string object
//		System.err.println(sb.substring(0,3));
		
		// this method reverse literal
//		System.out.println(sb.reverse());
	
//		System.out.println(sb instanceof Serializable);
		
		System.out.println(sb.delete(8, 16));
		
		
	}

}
