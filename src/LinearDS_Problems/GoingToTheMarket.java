package LinearDS_Problems;

import java.io.*;
import LinearDataStructures.*;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1281

public class GoingToTheMarket 
{	
	public class nodeProblem implements Node
	{
		String product;
		double price;
		nodeProblem next;
		
		public nodeProblem(String product, double price) 
		{
			this.product = product;
			this.price = price;
		}

		@Override
		public void setNext(Node node) 
		{
			
		}

		@Override
		public Node getNext() 
		{
			return new nodeProblem(this.product, this.price);
		}

		@Override
		public Node clone() 
		{
			return new nodeProblem(this.product, this.price);
		}

		@Override
		public boolean isEqual(Node node) 
		{
			nodeProblem temp = (nodeProblem)node;
			
			return temp.product.equals(this.product) ? true : false;
		}

		@Override
		public boolean isLessThan(Node node) 
		{
			return false;
		}
		
	}
	
	public GoingToTheMarket() {}
	
	public String solution()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int cases = Integer.parseInt(br.readLine());
			int amount, shop;
	
			for (int i = 0; i < cases; i++) 
			{
				List products = new List();
				amount = Integer.parseInt(br.readLine());
			
				for (int j = 0; j < amount; j++) 
				{
					String [] product = br.readLine().split(" ");
					//products.insertAtEnd(new nodeProblem(product, price));
				}
				
				shop = Integer.parseInt(br.readLine());
				
			}
		}
		catch(Exception ex) {}
		
		return "";
	}
	
	public static void main(String[] args) 
	{
		try
		{
			GoingToTheMarket problem = new GoingToTheMarket();
			
		}
		catch(Exception ex) {}
	}
}