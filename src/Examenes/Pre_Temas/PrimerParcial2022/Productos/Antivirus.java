package Examenes.Pre_Temas.PrimerParcial2022.Productos;

import Examenes.Pre_Temas.PrimerParcial2022.Fecha;
import Examenes.Pre_Temas.PrimerParcial2022.ProductoSeguridad;

public class Antivirus extends ProductoSeguridad {

    private boolean premium;

    public Antivirus(double coste, Fecha inicioContrato, Fecha finContrato, boolean premium) {
        super(coste, inicioContrato, finContrato);
        this.premium = premium;
    }



    protected int calcularCoste() {
        return 0;
    }

    @Override
    protected String descripcionCoste() {
        return "";
    }
}
