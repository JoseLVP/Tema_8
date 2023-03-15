package actividad_Resuelta_8_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int Opcion;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique la Hora Actual -> ");

		int Hora = sc.nextInt();

		System.out.println("Indique los Minutos Actuales -> ");

		int Minutos = sc.nextInt();

		System.out.println("Inque los Segundos Actuales -> ");

		int Segundos = sc.nextInt();

		Hora miHora = new Hora(Hora, Minutos, Segundos);

		miHora.setHora(miHora.ComprobarHora(Hora));

		do {

			System.out.println(" ** Hora Introducida ** ");
			System.out.println(miHora.getHora() + " / " + miHora.getMinutos() + " / " + miHora.getSegundos());
			System.out.println(" > Indique funcion a Realizar -> ");
			System.out.println(" [ 1 ] -> Aumentar Minutos");
			System.out.println(" [ 2 ] -> Mostrar Hora Actual");
			System.out.println(" [ 3 ] > Cambiar Hora Introducida");
			Opcion = sc.nextInt();

			switch (Opcion) {
			case 1 -> {
				miHora.setMinutos(miHora.Incrementar(miHora.getMinutos()));
			}
			case 2 -> {
				System.out.println("La hora introducida es -> " + miHora.getHora() + " / " + miHora.getMinutos() + " / "
						+ miHora.getSegundos());
			}
			case 3 -> {
				miHora.setHora(miHora.CambiarHora(miHora.getHora()));
				miHora.setHora(miHora.ComprobarHora(miHora.getHora()));
				System.out.println("La nueva hora introducida es -> " +miHora.getHora() );
				
			}
			}

			if (miHora.getMinutos() == 60) {
				miHora.setMinutos(0);
				miHora.setHora(miHora.getHora() + 1);
				if (miHora.getHora() == 24) {
					miHora.setHora(0);
				}

			}

		} while (Opcion != 5);

	}

}
