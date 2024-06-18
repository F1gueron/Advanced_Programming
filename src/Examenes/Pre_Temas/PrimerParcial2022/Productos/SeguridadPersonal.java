package Examenes.Pre_Temas.PrimerParcial2022.Productos;

import Examenes.Pre_Temas.PrimerParcial2022.Fecha;
import Examenes.Pre_Temas.PrimerParcial2022.ProductoSeguridad;

public abstract class SeguridadPersonal extends ProductoSeguridad {

    private boolean cualificados;

    public SeguridadPersonal(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados) {
        super(coste, inicioContrato, finContrato);
        this.cualificados = cualificados;
        if (cualificados){
            super.incrementarPrecio(300);
        }
    }

    @Override
    protected String descripcionCoste() {
        return "Has contratado seguridad personal";
    }
}
