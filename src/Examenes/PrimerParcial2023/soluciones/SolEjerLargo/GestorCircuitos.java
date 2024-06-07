package Examenes.PrimerParcial2023.soluciones.SolEjerLargo;

public class GestorCircuitos {

	private Circuito [] circuitos;
	private final int MAX_CIRCUITOS = 50;
	private int numCircuitos;

	public GestorCircuitos() {
		this.circuitos = new Circuito[this.MAX_CIRCUITOS];
		this.numCircuitos = 0;
	}

	public void addCircuito(Circuito circuito) {
		if (this.numCircuitos <this.circuitos.length) {
			this.circuitos[this.numCircuitos++] = circuito;
		}
	}

	private Circuito valido(Carrera carrera) {
		Circuito r = null;
		int i=0;
		Circuito c;
		while (i<this.numCircuitos) {
			c= this.circuitos[i];
			if (c.puedeAlbergar(carrera)) {
				return c;
			}
		}
		return r;
	}

	public void mostrarCircuito(Carrera carrera) {
		Circuito circuito = this.valido(carrera);
		if (circuito != null)
			circuito.mostrar();
		else
			System.out
					.println("No hay ningún circuito en el que se pueda celebrar la carrera");
	}

	public void actualizarCircuito(Carrera carrera) {
		Circuito circuito = this.valido(carrera);
		if (circuito != null)
			circuito.aceptar(carrera);
	}

	public void mostrar() {
		int i=0;

		System.out.println("--- Circuitos del gestor\n");
		while (i<this.numCircuitos) {
			this.circuitos[i].mostrar();
			i++;
		}

	}

	public static void main(String[] args) {
		GestorCircuitos gestor = new GestorCircuitos();
		gestor.addCircuito(new Circuito("Imola", 62, 305.609));
		gestor.addCircuito(new Circuito("Albert Park", 58, 307.574));
		gestor.mostrar();

		String [] escuderias = {"Ferrari","McLaren/Mercedes","Renault"};
		F1 f1 = new F1(new Fecha(12, 5, 2005), escuderias);
		gestor.mostrarCircuito(f1);
		//gestor.actualizarCircuito(f1);
		//gestor.mostrar();
		//gestor.mostrarCircuito(new F1(new Fecha(13, 5, 2005), escuderias));
	}

}
