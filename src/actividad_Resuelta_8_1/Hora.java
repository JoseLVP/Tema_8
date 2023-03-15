package actividad_Resuelta_8_1;

import java.util.Scanner;

public class Hora {

	private int Hora;
	private int Minutos;
	private int Segundos;

	public Hora() {

	}

	public Hora(int hora, int minutos, int segundos) {
		Hora = hora;
		Minutos = minutos;
		Segundos = segundos;
	}

	public int getHora() {
		return this.Hora;
	}

	public void setHora(int hora) {
		this.Hora = hora;
	}

	public int getMinutos() {
		return this.Minutos;
	}

	public void setMinutos(int minutos) {
		this.Minutos = minutos;
	}

	public int getSegundos() {
		return this.Segundos;
	}

	public void setSegundos(int segundos) {
		this.Segundos = segundos;
	}

	static public int Incrementar(int Minutos) {

		++Minutos;

		return Minutos;
	}

	static public int ComprobarHora(int Horas) {

		int NuevaHora = Horas;
		
		if (NuevaHora >= 0 && NuevaHora <60) {
			
		} else {
			do {
				System.out.println("Introduzca una Hora valida");
				NuevaHora = new Scanner(System.in).nextInt();
			} while (NuevaHora <0 || NuevaHora > 60);
			
		}
		
		return NuevaHora;
	}

	
	static public int CambiarHora(int Horas) {

		System.out.println("Introduce la Nueva Hora del Reloj ");
		Horas = new Scanner(System.in).nextInt();
		
		
		return Horas;
	}

	

}
