package ListProject;

import LinearDataStructures.*;
import java.io.*;

public class MainProject {
    
    public static List tourist = new List();
    public static Queue quotation = new Queue();
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static String menu()
    {
   	 	String menu = "\nBienvenidos al software para agencia de turismo. \nSeleccione alguna "
   	 			+ "de las siguientes opciones:\n1) Agregar turista\n2) Eliminar turista\n3)"
   	 			+ " Cotización\n4) Visualizar turistas\n5) Salir\n";
   	 
   	 	return menu;
    }
    
    public static void insert_tourist()
    {
   	 	try
   	 	{
   	 		bw.write("A continuación diligencie la información del turista. \nNombres: ");
   	 		bw.flush();
   	 		String name = br.readLine();
   	 		
   	 		bw.write("Apellidos: ");
   	 		bw.flush();
   	 		String surname = br.readLine();
   	 		
   	 		bw.write("ID: ");
   	 		bw.flush();
   	 		String id = br.readLine();
   	 		
   	 		bw.write("Teléfono: ");
   	 		bw.flush();
   	 		String phone = br.readLine();
   	 		
   	 		tourist.insertAtEnd(new Tourist(name, surname, id, phone));
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void delete_tourist()
    {
   	 	try
   	 	{
   	 		bw.write("A continuacion digite el ID del turista a eliminar: ");
   	 		bw.flush();
   	 		String id = br.readLine();
   	 		
   	 		int index = tourist.indexOf(new Tourist(id));
   	 		
   	 		if (index == -1)
   	 		{
   	 			bw.write("El ID ingresado no existe.\n");
   	 		}
   	 		else
   	 		{
   	 			tourist.deleteAtIndex(index);
	 			bw.write("El turista con el ID " + id + "ha sido eliminado exitosamente.");
   	 		}
   	 		bw.flush();
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void quotation_tour()
    {
   	 	try
   	 	{
   	 		bw.write("Seleccione alguna de las opciones respecto a la cotización.\n1)"
   	 				+ " Agregar cotización.\n2) Eliminar cotización");
   	 		bw.flush();
   	 		int sub_menu = Integer.parseInt(br.readLine());
   	 		
   	 		switch(sub_menu)
   	 		{
   			 	case 1:
   			 		add_quotation();
   			 	break;
   			 	case 2:
   			 		delete_quotation();
   			 	break;
   	 		}
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void add_quotation()
    {
   	 	try
   	 	{
   	 		bw.write("A continuacion complete la informacion que se solicita.\n ID: ");
   	 		bw.flush();
   	 		String id = br.readLine();
   	 		
   	 		bw.write("Ciudad de partida: ");
   	 		bw.flush();
   	 		String cityOrigin = br.readLine();
   	 		
   	 		bw.write("Ciudad de destino: ");
   	 		bw.flush();
   	 		String cityDestination = br.readLine();
   	 		
   	 		bw.write("Fecha de partida (DD/MM/AAAA): ");
   	 		bw.flush();
   	 		String dateExit = br.readLine();
   	 		
   	 		bw.write("Fecha de regreso (DD/MM/AAAA): ");
   	 		bw.flush();
   	 		String dateReturn = br.readLine();
   	 		
   	 		quotation.enqueue(new Quotation(id, cityOrigin, cityDestination, dateExit, dateReturn));
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void delete_quotation()
    {
   	 	try
   	 	{
   	 		
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void print_List()
    {
   	 	try
   	 	{
   	 		tourist.printList();
   	 	}
   	 	catch(Exception ex) {}
    }
    
    public static void save_tourisList()
	{
		try
		{
			FileWriter fw_tourist = new FileWriter("Tourist.txt");
			BufferedWriter bw_tourist = new BufferedWriter( fw_tourist);
			
			Student temp = (Student)tourist.head;
			
			while(temp != null)
			{
				bw_tourist.write(temp.toString());
				temp = (Student)temp.getNext();
			}
			
			bw_tourist.flush();
			
		}
		catch(Exception ex) {}
	}
	
	public static void load_tourist()
	{
		try
		{
			FileReader fr_tourist = new FileReader("Tourist.txt");
			BufferedReader br_tourist = new BufferedReader( fr_tourist );
			
			String input = br_tourist.readLine();
			String[] data;
			
			while(input != "")
			{
				input = br_tourist.readLine();
				
				data = input.split("\t");
				tourist.insertAtEnd(new Tourist(data[0].split(" ")[1], data[1].split(" ")[1],
						data[2].split(" ")[1], data[3].split(" ")[1]));
				
				input = br_tourist.readLine();
			}
			
		}
		catch(Exception ex) {}
	}
    
    public static void main(String[] args)
    {
   	 	int menu_option;
   	 	load_tourist();
   	 	tourist.printList();
    	
   	 	try
   	 	{
   	 		do
   	 		{
   	 			bw.write(menu());
   	 			bw.flush();
   	 			
   	 			menu_option = Integer.parseInt(br.readLine());
   	 			
   	 			while (menu_option > 5)
   	 			{
   	 				bw.write("Por favor, seleccione una opcion valida.\n");
   	 				bw.flush();
   	 				menu_option = Integer.parseInt(br.readLine());
   	 			}
   	 			
   	 			switch(menu_option)
   	 			{
   	 				case 1:
   	 					insert_tourist();
   	 				break;
   	 				case 2:
   	 					delete_tourist();
   	 				break;
   	 				case 3:
   	 					quotation_tour();
   	 				break;
   	 				case 4:
   	 					print_List();
   	 				break;
   	 			}
   	 		}
   	 		while(menu_option != 5);
   	 		
   	 		save_tourisList();
   	 	}
   	 	catch(Exception ex) {}
    }
}