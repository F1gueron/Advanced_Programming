package Examenes.Pre_Temas.PrimerParcial2023.soluciones.SolEjerLargo;

public class MotoGP extends Moto {

	private static final int MINIMO_NUM_VUELTAS = 60;
	
	public MotoGP(Fecha fecha) {
		super(fecha);
	}

	@Override
	public void mostrar() {
		super.mostrar("Carrera de MotoGP");
	}
	
	@Override
	public boolean esValido(Circuito circuito) {

		return circuito.incluye(MotoGP.MINIMO_NUM_VUELTAS);
	}
}
