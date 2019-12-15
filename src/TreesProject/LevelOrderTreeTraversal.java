package TreesProject;

import Trees.*;
import java.io.*;

public class LevelOrderTreeTraversal 
{
	public class nodeProblem implements BinaryTreeNode
	{
		@Override
		public void setLeft(BinaryTreeNode node) 
		{
			
		}

		
		@Override
		public BinaryTreeNode getLeft() 
		{
			return null;
		}

		
		@Override
		public void setRight(BinaryTreeNode node) 
		{
			
		}

		
		@Override
		public BinaryTreeNode getRight() 
		{
			return null;
		}

		
		@Override
		public BinaryTreeNode clone() 
		{
			return null;
		}

		
		@Override
		public boolean isEqual(BinaryTreeNode node) 
		{
			return false;
		}

		
		@Override
		public boolean isLessThan(BinaryTreeNode node) 
		{
			return false;
		}
		
		
		@Override
		public String toString()
		{
			return null;
		}
	}
	
	
	public LevelOrderTreeTraversal() {}
	
	
	public String solution()
	{
		return "";
	}
	
	
	public static void main(String [] args)
	{
		try
		{
			LevelOrderTreeTraversal problem = new LevelOrderTreeTraversal();
		}
		catch(Exception ex) {}
	}
}