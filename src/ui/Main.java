package ui;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int option=0;
		
		System.out.println("Seleccione una opcion:\n "+
			"(1) Add billboard\n"+
			"(2) Display billboards\n" +
			"(3) Export hazard report\n"+
			"(4) Exit\n" +
			"(0) -----");
				
			option = reader.nextInt();
			reader.nextLine();
				
			option = reader.nextInt();
			reader.nextLine();
					
			switch(option) {
			case 1:{
				break;		
				}
			case 2:{
				break;
				}
			case 3:{
				break;
				}	
			}
	}			
}
