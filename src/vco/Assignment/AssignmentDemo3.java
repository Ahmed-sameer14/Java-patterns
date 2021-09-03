package vco.Assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class AssignmentDemo3 
{
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(100);
		l.add(60);
		l.add(110);
		l.add(215);
		l.add(230);
		
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			
			if(i%10==0)
			{
				System.out.println(i);
			}
		}
	}
}
