package Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo;

public abstract class Moto extends Carrera {

	public Moto(Fecha fecha) {
		super(fecha);		
	}

	protected void mostrar(String mensaje) {
		System.out.println(mensaje);
	}	
	
	public boolean esValido(Circuito circuito) {
		return true;
	}
}
