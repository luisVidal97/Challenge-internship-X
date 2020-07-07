package intershipX;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {
	
	public static void main(String[] args) {
		
	
		getFirstExercise();
		getSecondExercies();
		getThirdExercise();
		getFourthExercise();
		getFifthExercise();
	}
	
	
	
	
	
	
	/**
	 * 
	 */
	public static void getFirstExercise() {
		for (int i = 1; i < 21; i++) {
			if(i%2==0) System.out.println(i);
		}
	}
	
	/**
	 * 
	 */
	public static void getSecondExercies() {
		int result = 0;
		for (int i = 1; i < 21; i++) {
			if(i%2 != 0) {
				System.out.println(i);
				result += i;
			}
		}
		System.out.println("El resultado de la suma de números impares del 1 al 20(incluido) es "+ result);
	}

	
	/**
	 * 
	 */
	public static void getThirdExercise() {
		
		int[] array = {500, 900, 13, 48, 300, 20, 10, 5, 1, 0, 250, 44, 94, 25, 22, 150, 8, 2, 9, 44, 75, 67, 33};

		System.out.println("Arreglo inicial:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

		// Bubble sort Algorithm.In the best case is 0(n), in the worst case is 0(n2)
		int aux=0;
		for (int i = 0; i < array.length - 1; i++) {
		     for (int j = 1; j < array.length; j++) {
		         if (array[j] > array[j-1]) {  
		        	 aux = array[j];
		             array[j] = array[j-1];
		             array[j-1] = aux;
		         }
		     }
		 }
		
		ArrayList<Integer> arrayLess50 = new ArrayList<Integer>();
		System.out.println(" \n Arreglo ordenado:");
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+" ");
			
			if( array[i]<50 ) arrayLess50.add(array[i]);
		}
		
		
		System.out.println(" \n Lista números menores de 50:");
		for (int i = 0; i < arrayLess50.size(); i++) {
			System.out.print(arrayLess50.get(i)+" ");
		}
	}
	
	/**
	 * 
	 */
	public static void getFourthExercise() {
		String inventory =    "Camisas:30,precio:100;"
				+ "Bolsas:50,precio:200;"	
				+ "Calcetines:100,precio:50;"
				+ "Corbatas:45,precio:150;"
				+ "Pantalones:200,precio:300;"
				+ "Suéteres:150,precio:250;"
				+ "Playeras:25,precio:100";

		String[] arrayInventory = inventory.split(";");
		ArrayList<String> array30Discount= new ArrayList<String>();
		ArrayList<String> array10Discount= new ArrayList<String>();

		for (int i = 0; i < arrayInventory.length; i++) {

			String[] clothes = arrayInventory[i].split(",");

			int amount = Integer.parseInt( clothes[0].split(":")[1] );
			int price =	Integer.parseInt( clothes[1].split(":")[1] );

			if ( amount < 50 ) {
				price -= price * 0.3 ; 
				array30Discount.add(clothes[0]+", precio con descuento:"+price);
			}
			else {
				price -= price * 0.1 ; 
				array10Discount.add(clothes[0]+", precio con descuento:"+price);
			}
		}

		System.out.println("============================================================");
		System.out.println("Lista de los elementos con el 30% de descuento");
		System.out.println("============================================================");
		for (int i = 0; i < array30Discount.size(); i++) {
			System.out.println(array30Discount.get(i));
		}
		System.out.println("\n============================================================");
		System.out.println("Lista de los elementos con el 10% de descuento");
		System.out.println("============================================================");
		for (int i = 0; i < array10Discount.size(); i++) {
			System.out.println(array10Discount.get(i));
		}		
	}
	
	
	/**
	 * 
	 */
	public static void getFifthExercise() {
		
		try {
			boolean flag = true ;
			Scanner in = new Scanner(System.in); 
			
			while( flag ) {
				
				System.out.println("Introduzca un número entero, por favor:");
				int number = in.nextInt();
				
				if( number%2 == 0 ) System.out.println("El número es par!!!!");
				else System.out.println("El número es impar o non!!!!");
				
					System.out.println("¿Desea introducir otro número? y/n");
					String response = in.next();
					
					if( response.equals("n") ) {
						
						System.out.println("El programa ha finalizado.");
						flag = false;
						
					}else if( !response.equals("y")) {
						
						System.out.println("El  caracter introducido no es válido");
					}
				}
			
			in.close();
			
		} catch (InputMismatchException e) {
			
			System.out.println("El caracter que introdujo no es u número. Reinicie el programa, por favor.");
			
		}
	}

}
