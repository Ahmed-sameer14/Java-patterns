package adapterpatterns;

import patterns.friend.PilotePen;

public class PenAdapter implements Pen
{
	PilotePen pp = new PilotePen();

	@Override
	public void write(String s) 
	{
		pp.mark(s);	
	}
}
