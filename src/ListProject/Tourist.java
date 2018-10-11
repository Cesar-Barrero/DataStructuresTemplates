package ListProject;
import LinearDataStructures.Node;

public class Tourist implements Node{
    
    String name = null;
    String surname = null;
    String id = null;
    String phone = null;
    
    Tourist next = null;
    
    public Tourist(String id)
    {
   	 	this.id = id;
    }
    
    public Tourist(String name, String surname,String id, String phone)
    {
   	 	this.name = name;
   	 	this.surname = surname;
   	 	this.id = id;
   	 	this.phone = phone;
    }

    @Override
    public void setNext(Node node)
    {
   	 	next = (Tourist)node;
    }

    @Override
    public Node getNext()
    {
   	 	return next;
    }

    @Override
    public Node clone()
    {
   	 	Tourist clone = new Tourist(name, surname, id, phone);
   	 	return clone;
    }

    @Override
    public boolean isEqual(Node node)
    {
   	 	Tourist temp = (Tourist)node;
   	 
   	 	if (this.id.equals(temp.id))
   	 		return true;
   	 
   	 	return false;
    }
   	 
    @Override
    public boolean isLessThan(Node node)
    {
   	 	return false;
    }
    
    @Override
    public String toString()
    {
   	 	return "Nombre: " + this.name + "\tApellidos: " + this.surname + "\tID: " + this.id +
   	 			"\tTeléfono: " + this.phone + "\n";
    }
}