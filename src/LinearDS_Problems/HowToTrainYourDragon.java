package LinearDS_Problems;

import java.io.*;
import LinearDataStructures.*;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1851

public class HowToTrainYourDragon {
	
	public class ProblemNode implements Node
	{
		
		int day;
		int cost;
		
		ProblemNode next = null;
		
		public ProblemNode(int day, int cost) 
		{
			this.day = day;
			this.cost = cost;
		}

		@Override
		public void setNext(Node node) 
		{
			next = (ProblemNode)node;
		}

		@Override
		public Node getNext() 
		{
			return next;
		}

		@Override
		public Node clone() 
		{
			ProblemNode temp = new ProblemNode(day, cost);
			return temp;
		}

		@Override
		public boolean isEqual(Node node) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public String toString()
		{
			return "";
		}
	}
	
	public HowToTrainYourDragon() {}
	
	public String solution(String input)
	{
		try 
		{
			BufferedReader br = new   BufferedReader(new InputStreamReader(System.in));
		}
		catch(Exception ex) {}
		
		return input;
		
	}
	
	public static void main(String[] args) 
	{
		String input = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HowToTrainYourDragon problem = new HowToTrainYourDragon();
		
		try
		{
			
		}
		catch(Exception ex) {}
	}
}
/*
public static List dragon = new List();
public static Queue training = new Queue();

public static void insert_dragon(int day, int cost)
{
	try
	{		
		String input = br.readLine();
		while(!input.equals(""))
		{
			bw.write("Error: Valores incorrectos");
			bw.flush();
	 	}
	 		
		while(day >= 1 && cost <= 1) 
		{
			training.enqueue(new dragon(day,cost) );
	 	}
	}
	catch(Exception ex) {}
}
	
public static void main(String[] args)
{
	int day = 0 ;
	int cost = 0 ;
		
	try
	{
		day= Integer.parseInt( br.readLine());
		bw.write("\t");
		bw.flush();
		
		cost= Integer.parseInt(br.readLine());
		bw.write("\n");
		bw.flush();
		
		insert_dragon(day, cost);
		
	}
	catch(Exception ex) {}
}*/
