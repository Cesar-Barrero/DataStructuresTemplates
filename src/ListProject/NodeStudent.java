package ListProject;
import LinearDataStructures.Node;

public class NodeStudent implements Node{
	
	String name = null;
	String id = null;
	int age = 0;
	String program = null;
	
	NodeStudent next = null;
	
	public NodeStudent(String name, String id, int age, String program) 
	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.program = program;
	}

	@Override
	public void setNext(Node node) 
	{
		next = (NodeStudent)node;
	}

	@Override
	public Node getNext() 
	{
		return null;
	}

	@Override
	public Node clone() 
	{
		NodeStudent clone = new NodeStudent(name, id, age, program);
		return clone;
	}

	@Override
	public boolean isEqual(Node node) 
	{
		NodeStudent temp = (NodeStudent)node;
		
		if (this.id.equals(temp.id)) 
			return true;
		else
			return false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		NodeStudent temp = (NodeStudent)node;
		
		if (this.age < temp.age) 
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + this.name + "\tID: " + this.id + "\n";
	}
}