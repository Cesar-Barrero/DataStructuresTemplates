package ListProject;
import LinearDataStructures.Node;

public class Request implements Node{
	
	public String id_student;
	public String date;
	public String text;
	
	public Request(String id, String date, String text) 
	{
		this.id_student = id;
		this.date = date;
		this.text = text;
	}

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