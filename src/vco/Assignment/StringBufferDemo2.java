package vco.Assignment;

public class StringBufferDemo2 
{
	public static void main(String[] args)
	{
//		String s=new String("hello");
//		StringBuilder sb = new StringBuilder(s);
//		
//		System.out.println(sb);
		
		StringBuffer sb = new StringBuffer("world");
		String s=sb.toString();
		System.out.println(s);
	}
}
