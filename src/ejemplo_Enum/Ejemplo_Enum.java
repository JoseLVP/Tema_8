package ejemplo_Enum;

import java.util.Scanner;

import enum_Controller.DiasSemana;

public class Ejemplo_Enum {

	public static void main(String[] args) {
		
		DiasSemana d=null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique el dia de la Semana ");
		System.out.println("[ 1 ] > Lunes ... [ 7 ] > Domingo ");
		int Opcion = sc.nextInt();
		
		switch (Opcion) {
		case 1-> d=DiasSemana.LUNES; 
		case 2-> d=DiasSemana.MARTES; 
		case 3-> d=DiasSemana.MIERCOLES; 
		case 4-> d=DiasSemana.JUEVES; 
		case 5-> d=DiasSemana.VIERNES; 
		case 6-> d=DiasSemana.SABADO; 
		case 7-> d=DiasSemana.DOMINGO; 
		
		default-> System.out.println("Entrada no valida");
		
		}	
		
		//****Metodos que se puede Aplicar con un Enum****
		
		System.out.println("Metodo .name() -> " +d.name());
		System.out.println("Metodo .toString() -> " +d.toString());
		System.out.println("Metodo .ordinal() -> " +d.ordinal());
		System.out.println("Metodo .values() + for-each_ -> " +d.ordinal());
		
		for (DiasSemana dM : DiasSemana.values()) {
			System.out.print(dM + " ");
		}
		
		System.out.println("\n");

		//Vamos a declarar otro dia
		
		System.out.print("Indique el dia de la Semana ");
		System.out.println("[ 1 ] > Lunes ... [ 7 ] > Domingo ");
		Opcion = sc.nextInt();
		
		//Si tenemos muchas opciones o nuestro enum es muy extenso
		DiasSemana OtroDia=DiasSemana.values()[Opcion-1];
		System.out.println("El otro dia es -> " +OtroDia.name());
		
		
		
		//Lunes....Domingo.... compareTo
		System.out.println("Metodo .compareTo -> " +d.compareTo(OtroDia));
		
		if (d.compareTo(OtroDia) > 0) {
			System.out.println("El " +d.toString()+ " es despues de " +OtroDia.toString());
			
		}else {
			System.out.println("El " +OtroDia.toString()+ " es despues de " +d.toString());
		}
		
		
		if (d.equals(DiasSemana.VIERNES)) {
			System.out.println("Por fin viernes, llego el fin de semana");
		}
		
		if (OtroDia.equals(DiasSemana.LUNES)) {
			System.out.println("Que fastidio, a trabajar ");
		}
		
		
		
		
		sc.close();
	}
 
}
