package TreesProject;

import Trees.*;
import java.io.*;

public class AndyFirstDictionary 
{	
	public class nodeProblem implements BinaryTreeNode
	{
		public String text;
		public nodeProblem left;
		public nodeProblem right;
		
		public nodeProblem(String text) 
		{
			this.text = text;
		}
		
		
		@Override
		public void setLeft(BinaryTreeNode node) 
		{
			left = (nodeProblem)node;
		}

		
		@Override
		public BinaryTreeNode getLeft()
		{
			return left;
		}

		
		@Override
		public void setRight(BinaryTreeNode node)
		{
			right = (nodeProblem)node;
		}

		
		@Override
		public BinaryTreeNode getRight() 
		{
			return right;
		}

		
		@Override
		public BinaryTreeNode clone() 
		{
			return new nodeProblem(this.text);
		}

		
		@Override
		public boolean isEqual(BinaryTreeNode node) 
		{
			nodeProblem temp = (nodeProblem)node;
			return this.text == temp.text ? true : false;
		}

		
		@Override
		public boolean isLessThan(BinaryTreeNode node) 
		{
			nodeProblem temp = (nodeProblem)node;
			return temp.text < text ? false : true;
		}
		
		
		@Override
		public String toString()
		{
			return text + "\n";
		}
	}
		
	
	public AndyFirstDictionary() {}
	
	
	public String solution(String text)
	{
		
		return "";
	}
	
	
	public static void main(String [] args) 
	{
		String text = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		AndyFirstDictionary problem = new AndyFirstDictionary();
		
		try
		{
			text = br.readLine();
			
			while(text != "")
				bw.write(problem.solution(text));
			
			bw.flush();
		}
		catch(Exception ex) {}
	}
}