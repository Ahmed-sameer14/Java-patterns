package vco.Assignment;

public class PerformanceOFStringBufferAndBuilder {

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb1= new StringBuffer("hello world");
		
		for(int i=0;i<10000;i++)
		{
			sb1.append("Tpoint");
		}
		System.out.println("time taken by string buffer :"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2= new StringBuilder("hello world");
		
		for(int i=0;i<10000;i++)
		{
			sb2.append("Tpoint");
		}
		System.out.println("time taken by string builder:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
