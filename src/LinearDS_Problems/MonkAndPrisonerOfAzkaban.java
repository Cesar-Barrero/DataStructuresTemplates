package LinearDS_Problems;

import java.io.*;
import LinearDataStructures.*;

//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/monk-and-prisoner-of-azkaban/

public class MonkAndPrisonerOfAzkaban 
{	
	public class ProblemNode implements Node
	{
		public int parchment;

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
	
	public MonkAndPrisonerOfAzkaban() {}
	
	public String solution(String input)
	{
		return input;		
	}
	
	public static void main(String[] args) 
	{
		
	}
}