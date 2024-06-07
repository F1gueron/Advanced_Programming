package Examenes.PrimerParcial2023.soluciones.SolEjerLargo;

public class DocientosCincuentaCC extends Moto {

	public DocientosCincuentaCC(Fecha fecha) {
		super(fecha);		
	}

	@Override
	public void mostrar() {
		super.mostrar("Carrera de motos de 250cc");
	}
}
