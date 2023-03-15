package actividad_Aplicacion_8_11;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		int Altura, Ancho, Profundo, Opcion, Condicion = 1;
		String Texto="";
		Unidades unidad = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ** Programa de Generacion de Cajas ** \n");
		
		System.out.println(" -> Introduzca el Valor de Altura para la Caja");
		Altura = sc.nextInt();
		
		System.out.println(" -> Introduzca el Valor de Anchura para la Caja");
		Ancho = sc.nextInt();
		
		System.out.println(" -> Introduzca el Valor de Profundida para la Caja");
		Profundo = sc.nextInt();
		
		System.out.println(" -> Introduce el Valor de la Medida de la Caja [ 1 - Centimetros ] [ 2 - Metros ]");
		Opcion= sc.nextInt();
		
		unidad=Unidades.values()[Opcion-1];
		
		
		
		Caja miCaja = new Caja(Ancho, Altura, Profundo, unidad);
		
		System.out.println("\nEl volumen total de la caja introducida es -> " +miCaja.ValorCaja(miCaja.getVolumen())+ " " +unidad);
		
		
		
	
		
		
		
		while (Condicion == 1) {
			
			System.out.println("\nIntroduzca el Texto de la Etiqueta de envio ->  [ Maximo 30 Caracteres ]");
			Texto = sc.next();
			System.out.println(" ** Analizando Etiqueta ** ");
			
			
			int Auxiliar = miCaja.ComprobarEtiqueta(Texto);
			
			if (Auxiliar==1) {
				System.out.println("\nSu Etiqueta es Valida, imprimiendo ");	
				Condicion = 0;
				break;
			}
			
			if (Auxiliar==0) {
				Condicion = 1;
				
			}
			
		}
		
		System.out.println(miCaja.ResultadoFinal(miCaja.getVolumen(), miCaja.getAlto(), miCaja.getAncho(), miCaja.getProfundo(), unidad, Texto.substring(0,29)));

		
		
		
	}

}
