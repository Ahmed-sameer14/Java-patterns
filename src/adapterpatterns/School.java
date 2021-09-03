package adapterpatterns;

//Adapter Design Pattern
 
import patterns.friend.PilotePen;

public class School 
{
	public static void main(String[] args) 
	{
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeass("i am littel tired now ");
	}
}
