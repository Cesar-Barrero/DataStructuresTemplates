package ListProject;
import LinearDataStructures.Node;

public class Report implements Node{
	
	public String id_student;
	public String [] courses;
	public String [] grades;

	@Override
	public void setNext(Node node) 
	{
		
	}

	@Override
	public Node getNext() 
	{
		
		return null;
	}

	@Override
	public Node clone() 
	{
		
		return null;
	}

	@Override
	public boolean isEqual(Node node) 
	{
		
		return false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		
		return false;
	}
}