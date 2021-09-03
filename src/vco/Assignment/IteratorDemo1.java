package vco.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo1 
{
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
//		l.remove(1);
//		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
//			Integer i=itr.next();
//			if(i==2)
//			{
//				itr.remove();
//			}
			System.out.println(itr.next());
		}
		
		
//		for(int i=0;i<l.size();i++)
//		{
//			if(i==2)
//			{
//				l.remove(1);
//			}
//		}
//		System.out.println(l);	
	}
}
