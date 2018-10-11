package LinearDS_Problems;
import java.io.*;
import LinearDataStructures.*;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1851

public class HowToTrainYourDragon {
	
	public static List dragon = new List();
	public static Queue training = new Queue();
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
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
	}
}
