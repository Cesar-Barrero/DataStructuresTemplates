package TreesProject;

import java.io.*;
import Trees.*;

public class Main 
{
	public static BinaryTree tree = new BinaryTree();
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static String menu()
	{
		String menu = "\nÁrboles binario. \nSeleccione alguna de las siguientes opciones:\n1) "
				+ "Agregar un nodo al árbol.\n2) Eliminar un nodo del árbol.\n3) "
				+ "Recorrido del árbol.\n4) Salir.\n";
		return menu;
	}
	
	public static void insert_node()
	{
		try
		{
			bw.write("Digite el número que desea agregar al árbol: ");
			bw.flush();
			int value = Integer.parseInt(br.readLine());
			
			tree.insert(new BinaryNodeExample(value));
		}
		catch(Exception ex) {}
	}
	
	public static void delete_node()
	{
		try
		{
			bw.write("Digite el número que desea eliminar: ");
			bw.flush();
			int value = Integer.parseInt(br.readLine());
			
			if (value != -1)
			{
				tree.delete(new BinaryNodeExample(value));
				bw.write("El número " + value + " ha sido eliminado exitosamente.\n");
			}
			else
				bw.write("El número ingresado no existe.\n");

			bw.flush();
		}
		catch(Exception ex) {}
	}
	
	public static void travel_tree()
	{
		try
		{
			bw.write("Ingrese una de las opciones respecto a los recorridos del árbol:\n1)"
					+ " Pre_orden.\n2) Post-orden.\n3) In-orden\n");
			bw.flush();
			
			int submenu_option = Integer.parseInt(br.readLine());
			
			switch(submenu_option)
			{
				case 1:
					
				break;
				case 2:
					
				break;
				case 3:
					
				break;
			}
		}
		catch(Exception ex) {}
	}
	
	public static void save_tree()
	{
		try
		{
			FileWriter fw_tree = new FileWriter("tree.txt");
			BufferedWriter bw_tree = new BufferedWriter(fw_tree);
			
			BinaryNodeExample temp = (BinaryNodeExample)tree.root;
			
			while (temp != null) 
			{
				bw_tree.write(temp.toString());
				temp = (BinaryNodeExample)temp.getLeft();
				temp = (BinaryNodeExample)temp.getRight();
			}
			bw_tree.flush();
		}
		catch(Exception ex) {}
	}
	
	public static void load_tree()
	{
		
	}
	
	public static void main(String [] args)
	{
		int menu_option;
		//load_tree();
		
		try
		{
			do
			{
				bw.write(menu());
				bw.flush();
				
				menu_option = Integer.parseInt(br.readLine());
				
				while(menu_option > 4)
				{
					bw.write("Por favor, seleccione una opción valida.\n");
					bw.flush();
					menu_option = Integer.parseInt(br.readLine());
				}
				
				switch(menu_option)
				{
					case 1:
						insert_node();
					break;
					case 2:
						delete_node();
					break;
					case 3:
						travel_tree();
					break;
				}
			}
			while(menu_option != 4);
			
			save_tree();
		} 
		catch(Exception ex) {}
	}
}