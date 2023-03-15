package enumAvanzado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int Opcion;
		double PrecioTotal;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" ** Indique el articulo a Pagar ** ");
			System.out.println(" 1-> Aceote de Oliva "); //5%
			System.out.println(" 2-> Lecha "); //10%
			System.out.println(" 3-> Cerveza "); //21%
			System.out.println(" 4-> Mascarilla Quirurgicas "); //
			System.out.println(" 5-> Queso  "); //
			System.out.println(" 6-> Salir "); //
			
			Opcion = sc.nextInt();
			
			System.out.println("Indique el Precio -> ");
			double precio=sc.nextDouble();
			switch (Opcion) {
			case 1-> {
				Iva Impuesto=Iva.OTROS;
				calculatTotal(precio, Impuesto.getPorcentaje());
			}
			
			case 2-> {
				Iva Impuesto=Iva.ALIMENTACION;
				calculatTotal(precio, Impuesto.getPorcentaje());
			}
			
			case 3-> {
				Iva Impuesto=Iva.NORMAL;
				calculatTotal(precio, Impuesto.getPorcentaje());
			}
			case 4-> {
				Iva Impuesto=Iva.MEDICINAS;
				calculatTotal(precio, Impuesto.getPorcentaje());
			}
			case 5-> {
				Iva Impuesto=Iva.EXCENTO;
				calculatTotal(precio, Impuesto.getPorcentaje());
			}
			
			case 6-> {
				System.out.println("Miau");
			}
			
			default -> System.out.println("Toooooonto");
			}
			
			
		} while (Opcion!=6);
		
	}

	static void calculatTotal(double Precio, double Porcentaje) {

		double iva=(Porcentaje+100/100);
		System.out.printf("El importe a pagar es %.2f", Precio*iva);
		
		
	}
}
