package actividad_Aplicacion_8_11;

import java.util.Scanner;

public class Caja {

		private int Ancho;
		private int Alto;
		private int Profundo;
		private int Volumen;
		Unidades Unidad;
		
		public Caja() {
			
		}

		public Caja(int ancho, int alto, int profundo, Unidades unidad) {
			this.Ancho = ancho;
			this.Alto = alto;
			this.Profundo = profundo;
			this.Unidad = unidad;
			
			switch (unidad) {
			case CENTIMETROS -> {
				Volumen = (ancho / 100) * (alto * 100) * (profundo * 100); 
				}
			case METROS -> {
				Volumen = ancho * alto * profundo;
				}	
			}
			
		}

		public int getAncho() {
			return Ancho;
		}

		public void setAncho(int ancho) {
			Ancho = ancho;
		}

		public int getAlto() {
			return Alto;
		}

		public void setAlto(int alto) {
			Alto = alto;
		}

		public int getProfundo() {
			return Profundo;
		}

		public void setProfundo(int profundo) {
			Profundo = profundo;
		}

		public int getVolumen() {
			return Volumen;
		}

		public void setVolumen(int volumen) {
			Volumen = volumen;
		}

		public Unidades getUnidad() {
			return Unidad;
		}

		public void setUnidad(Unidades unidad) {
			Unidad = unidad;
		}
		
		
		
		static public int ValorCaja(int Valor) {
			
			return Valor;
			
		}
		
		static public int ComprobarEtiqueta (String Texto) {
			
			int Devuelto=0;
			int Seleccion;
			
			if (Texto.length()<=30 && Texto.length() > 0) {
				
				Devuelto = 1;
				
			}
			if (Texto.length() > 31) {
				
				System.out.println("Su etiqueta Excede los 30 caracteres;");
				System.out.println("La etiqueta recortada a 30 caracteres quedaria como -> " +Texto.substring(0, 29));
				System.out.println("\nDesea Imprimirla recortada o escribir una nueva? [ 1 - Imprimir ][ 2 - Nueva]");
				
				Seleccion = new Scanner(System.in).nextInt();
				
				if (Seleccion == 1) {
					
					Devuelto = 1;
				} else {
			
					Devuelto = 0;
				}
			}
			return Devuelto;
	}
		
		public String ResultadoFinal(int Volumen, int Alto, int Ancho, int Profundo, Unidades unidad2, String Texto) {
			
			
			return "\nEl resultado final de la caja es -> \nVolumen Total -> " +Volumen+ " " +unidad2+
					"\n [Alto - " +Alto+ " " +unidad2+
					"] \n [Ancho - " +Ancho+ " " +unidad2+
					"] \n [Alto - " +Profundo+ " " +unidad2+
					"] \n y en su Etiqueta, el Texto de -> [ " +Texto+ " ]";
		}
		
}

