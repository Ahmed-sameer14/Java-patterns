package vco.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssisgnmentDemo1 
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
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i)%2==0)
		{
			evenmap.put(li.get(i),String.valueOf(li.get(i)));
		}
		else 
		{
			oddmap.put(li.get(i),String.valueOf(li.get(i)));
		}
			System.out.println("\n\n\niteration:"+(i+1));
			System.out.println("printing even map elements");
			System.out.println(evenmap);
			System.out.println("\n");
			System.out.println("printing odd map elements");
			System.out.println(oddmap);
		}
	}
}
