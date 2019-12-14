package LinearDS_Problems;

import java.io.*;
import LinearDataStructures.Node;

//https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/little-monk-and-goblet-of-fire/

public class LittleMonkAndGobletOfFire 
{	
	public class ProblemNode implements Node
	{
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
		
		public String toString()
		{
			return "";
		}
	}
	
	public LittleMonkAndGobletOfFire() {}
	
	public String solution(String input)
	{
		return input;
	}
	
	public static void main(String[] args) 
	{
	}
}