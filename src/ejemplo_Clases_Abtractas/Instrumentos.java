package ejemplo_Clases_Abtractas;

import java.util.Arrays;

public abstract class Instrumentos {

	protected Notas[] notas;

	
	public Instrumentos(Notas[] melodia) {
		this.notas = new Notas[0]; //Inicializamos el array en 0 de longitud para luego insetar la nota
	}


	public Notas[] getNotas() {
		return notas;
	}


	public void add(Notas n) {
		notas = Arrays.copyOf(notas, notas.length+1);
		notas[notas.length-1]=n;
	}
	
	
	public abstract void Interpretar();
	
	
	
	
}
