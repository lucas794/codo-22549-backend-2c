package ar.com.codoacodo.controllers;

import java.util.Scanner;

public class CrudMain {

	//static Scanner teclado = new  Scanner(System.in); //si declaramos metodos dentro de la clase main, necesitamos tener el scanner fuera 

	public static void main(String[] args) throws Exception {
		
		
		Scanner teclado = new  Scanner(System.in) ;	//creamos la clase leer tipo Scanner
		
		System.out.println("Por favor selecione la opcion deseada:");
		System.out.println("1-Alta");
		System.out.println("2-Baja");
		System.out.println("3-Modificacion");
		System.out.println("4-Buscar por id");
		System.out.println("5-Salir");
		
		
		//int opcion = teclado.nextInt();----/al tener un ciclo for la variable "opcion" debe estar declarada 
											//	fuera pero 	su clase "nextInt debe estar dentro del ciclo	
		
		int opcion=0;
		
		do {               //repite el menu de opciones mientras que la opcion !=5
			
			/*System.out.println("Por favor selecione la opcion deseada:");
			System.out.println("1-Alta");
			System.out.println("2-Baja");
			System.out.println("3-Modificacion");
			System.out.println("4-Buscar por id");
			System.out.println("5-Salir");*/
			
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("ingrese los datos del articulo");
				//create();
			
				break;
			case 2:
				System.out.println("ingrese el id del articulo que quiere eliminar");
				//delete();
				break;
			case 3:
				System.out.println("ingrese el id del articulo que quiere modificar");
				//update();
				break;
			case 4:
				System.out.println("ingrese el id del articulo que quiere buscar");
				//getById();
				break;
			case 5:
				//salir();
				break;
			default:
				System.out.println("Opcion invalida!!");
			}
			
			
		}while(opcion!=5);
		
	}
		
}

