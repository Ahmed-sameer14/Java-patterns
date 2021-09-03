package vco.Assignment;

import java.util.*;

public class ComparatorDemo1 implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		
		sortIntObj();
	}
	
	public static void sortIntObj()
	{
List<Integer> l = new ArrayList<Integer>();
		
		l.add(3);
		l.add(7);
		l.add(9);
		
		System.out.println("before sorting : "+l);
		Collections.sort(l,new ComparatorDemo1());
		System.out.println("After sorting :"+l);
	}
	
	public int compare(Integer i1,Integer i2)
	{
		return i2.compareTo(i1);
	}
}
