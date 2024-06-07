package Examenes.PrimerParcial2023.soluciones.SolEjerLargo;

public class F1 extends Carrera {

	private static final int MINIMO_NUM_VUELTAS = 55;
	private static final int MAX_ESCUDERIAS = 10;
	private String [] escuderias;
	
	public F1(Fecha fecha, String [] escuderias) {
		super(fecha);		
		this.escuderias = escuderias;
	}	
	
	@Override
	public void mostrar() {		
		System.out.println(" **** Carrera de Fórmula 1 **** ");
		System.out.println("Escuderías participantes:");
		for (String e:this.escuderias)
			System.out.println(e);		
		System.out.println(" ******************************* ");
	}

	@Override
	public boolean esValido(Circuito circuito) {
		return circuito.incluye(F1.MINIMO_NUM_VUELTAS);
	}
}
