package vco.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AssignmentDemo2 
{
	public static void main(String[] args)
	{
	List<Integer> li = new ArrayList<Integer>();
	li.add(6);
	li.add(9);
	li.add(12);
	li.add(13);
	li.add(10);
	li.add(15);
	li.add(7);
	li.add(18);
	li.add(3);
	//System.out.println(li);
	//System.out.println(5%2);
	Map<Integer,String> oddmap =new HashMap<Integer,String>();
	Map<Integer,String> evenmap =new HashMap<Integer,String>();
	
	Iterator<Integer> itr=li.iterator();
	while(itr.hasNext())
	{
		Integer i=itr.next();
		if(i%2==0)
		{
			evenmap.put(i,String.valueOf(i));
		}
		else
		{
			oddmap.put(i,String.valueOf(i));
		}
	}
	System.out.println(evenmap);
	System.out.println(oddmap);
	
	}
}

