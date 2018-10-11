package ListProject;
import LinearDataStructures.Node;

public class Quotation implements Node{
    
    public String id_traveler = null;
    public String cityOrigin = null;
    public String cityDestination = null;
    public String dateExit = null;
    public String dateReturn = null;
    
    public Quotation(String id, String cityOrigin, String cityDestination, String dateExit,
    		String dateReturn)
    {
   	 	this.id_traveler = id;
   	 	this.cityOrigin = cityOrigin;
   	 	this.cityDestination = cityDestination;
   	 	this.dateExit = dateExit;
   	 	this.dateReturn = dateReturn;
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